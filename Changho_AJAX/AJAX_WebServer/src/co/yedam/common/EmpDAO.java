package co.yedam.common;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DAO {
   public boolean checkId(String id) {
      connect();
      String sql = "select * from empl_demo where employee_id=?";
      
      //데이터 있거나 , 에러 == > false , 없는게 확실 =>true;
      try {
         psmt=conn.prepareStatement(sql);
         psmt.setString(1, id);
         rs=psmt.executeQuery();
         if(rs.next()) {
            return false;
         }else {
            return true; // 없는게 확실
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disconnect();
      }
      return false;
   }
   
   public List<Employee> getEmpList(){
      connect();
      List<Employee> list = new ArrayList();
      String sql = "select * from empl_demo";
      try {
         stmt = conn.createStatement();
         rs=stmt.executeQuery(sql);
         while(rs.next()) {
            Employee emp =new Employee();
            emp.setEmployeeId(rs.getInt("employee_id"));
            emp.setLastName(rs.getString("last_name"));
            emp.setEmail(rs.getString("email"));
            emp.setHireDate(rs.getString("hire_date").substring(0,10));
            emp.setJobId(rs.getString("job_id"));
            
            list.add(emp);
            
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disconnect();
      }
      return list;
      
      
   }
   
   public boolean insertEmp(Employee emp) {
      connect();
      String sql = "insert into empl_demo (employee_id, last_name, email, job_id, hire_date)\r\n"
            + "values(?, ?, ?, ?, ?)\r\n" + "";
      try {
         psmt = conn.prepareStatement(sql);
         psmt.setInt(1, emp.getEmployeeId());
         psmt.setString(2, emp.getLastName());
         psmt.setString(3, emp.getEmail());
         psmt.setString(4, emp.getJobId());
         psmt.setString(5, emp.getHireDate());
         int r = psmt.executeUpdate();
         System.out.println(r + "  엯 젰 맖. ");
         return true;
         
      } catch (SQLException e) {
         e.printStackTrace();
         return false;
      } finally {
         disconnect();
      }
   }
   
   
   
   public void updateEmp(Employee emp) {
      connect();
      String sql = "update empl_demo set last_name=?, email=?,job_id=?,hire_date=? where employee_id=?";
      try {
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, emp.getLastName());
         psmt.setString(2, emp.getEmail());
         psmt.setString(3, emp.getJobId());
         psmt.setString(4, emp.getHireDate());
         psmt.setString(5, emp.getEmployeeId());
         int r = psmt.executeUpdate();
         System.out.println(r+ "嫄   닔 젙 맖.");
      } catch (SQLException e) {
         
         e.printStackTrace();
      }finally {
         disconnect();
      }
   }
   
   public int deleteEmployee(String empId) {
      connect();
      String sql = "delete from empl_demo where employee_id = " + empId;
      try {
         stmt = conn.createStatement();
         int r = stmt.executeUpdate(sql);
         System.out.println(r + "건 삭제됨.");
         return Integer.parseInt(empId);

      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         disconnect();
      }
      return -1;
   }

      
}