package co.briiiqtt.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.briiiqtt.prj.member.serviceimpl.MemberServiceImpl;
import co.briiiqtt.prj.member.vo.MemberVO;


public class MemberLogin implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(); //session��ü�� �ҷ��´�.
		
		MemberServiceImpl memberDAO = new MemberServiceImpl();
		MemberVO memberVO = new MemberVO();
		memberVO.setId(request.getParameter("id")); // ������ �Է°��� vo��ü�� ����
		memberVO.setPassword(request.getParameter("password"));

		memberVO = memberDAO.memberLogin(memberVO);
		String page;
		if (memberVO.getName() != null) {
//			request.setAttribute("member", memberVO);
			session.setAttribute("id", memberVO.getId());
			session.setAttribute("author", memberVO.getAuthor());
			session.setAttribute("name", memberVO.getName());
			page = "member/memberLoginSucceed";
		} else {
			page = "member/memberLoginFailed";
		}
		return page;
	}

}
