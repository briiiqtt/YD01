package co.briiiqtt.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberLogout implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//๋ก๊ทธ์์
		HttpSession session = request.getSession();
		session.invalidate();
		return "home.do";
	}

}
