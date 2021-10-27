package co.briiiqtt.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.briiiqtt.prj.member.service.MemberService;
import co.briiiqtt.prj.member.serviceimpl.MemberServiceImpl;
import co.briiiqtt.prj.member.vo.MemberVO;


public class MemberSelectList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		MemberService dao = new MemberServiceImpl();
		List<MemberVO> list = new ArrayList<>();
		list = dao.memberSelectList();
		
		request.setAttribute("members", list);	//�Ѿ�� ���� ������ �������� �����ϱ� ����
		return "member/memberSelectList";
	}

}
