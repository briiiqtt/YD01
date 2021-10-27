package co.dongil.mager.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dongil.mager.comm.Command;
import co.dongil.mager.member.service.MemberService;
import co.dongil.mager.member.serviceImpl.MemberServiceImpl;
import co.dongil.mager.member.vo.MemberVO;

public class MemberSelectList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
//멤버목록 가져오기
		MemberService memberDao = new MemberServiceImpl();
		List<MemberVO> list = new ArrayList<>();
		list = memberDao.memberSelectList();
		request.setAttribute("members", list);// members 에 list 객체를 담아서 request 로 던져줌
		return "member/memberSelectList";
	}
}
