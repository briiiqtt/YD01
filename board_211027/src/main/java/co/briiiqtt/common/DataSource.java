package co.briiiqtt.common;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {
	private Connection conn;
	private static DataSource dataSource;
	private String driver;
	private String url;
	private String user;
	private String password;
	
	private DataSource() {
		getProperties();	//외부에 있는 데이터베이스 정보를 가져온다.
	}
	
	public static DataSource getInstance() {
		dataSource = new DataSource();
		return dataSource;
	}
	
	public Connection getConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println(driver+user+password+url);
			e.printStackTrace();
		}
		return conn;
	}
	
	private void getProperties() {
		String resource = "/db.properties";
		Properties properties = new Properties();
		try {
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(resource);
			properties.load(inputStream);
			driver = properties.getProperty("driver");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
			url = properties.getProperty("url");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
