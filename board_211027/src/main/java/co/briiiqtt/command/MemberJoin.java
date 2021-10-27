package co.briiiqtt.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.briiiqtt.prj.member.service.MemberService;
import co.briiiqtt.prj.member.serviceimpl.MemberServiceImpl;
import co.briiiqtt.prj.member.vo.MemberVO;

public class MemberJoin implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		MemberService memberDAO = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo.setName(request.getParameter("name"));
		vo.setAddress(request.getParameter("address"));
		vo.setTel(request.getParameter("tel"));
		vo.setAuthor(request.getParameter("author"));
		int n = memberDAO.memberInsert(vo);
		String viewPage = null;
		if (n != 0) {
			request.setAttribute("message", "회원가입 성공");
			viewPage = "member/memberJoinSucceed";
		} else {
			request.setAttribute("message", "회원가입 실패");
			viewPage = "member/memberJoinFailed";
		}
		return viewPage;
	}

}
