package co.briiiqtt.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.briiiqtt.prj.member.service.MemberService;
import co.briiiqtt.prj.member.serviceimpl.MemberServiceImpl;
import co.briiiqtt.prj.member.vo.MemberVO;

public class MemberSelfInfo implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		MemberService memberDAO = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
//		vo.setId(request.getParameter("id"));
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("id"));
		vo.setId(String.valueOf(session.getAttribute("id")));
//		System.out.println(vo.getId());
		vo = memberDAO.memberSelect(vo);
		request.setAttribute("memberInfo", vo);
//		System.out.println(vo.getName() + vo.getAddress() + vo.getTel());
		return "member/memberSelfInfo";
	}

}
