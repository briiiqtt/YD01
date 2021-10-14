package com.mustacchio.briiiqtt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charSet=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		String memberID = request.getParameter("memberID");
		String memberPW = request.getParameter("memberPW");

		MemberDAO dao = new MemberDAO();
		Member loggedIn = dao.login(memberID,memberPW);
		
		if (loggedIn == null) {
			out.println("ㅋㅋㄹㅃㅃ");
			System.out.println("ㅋㅋㄹㅃㅃ");
		} else {
			out.println(loggedIn.getMemberName() + "님 방가방가 하이루~^^");
			System.out.println("ㅎㅇ");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
