package co.briiiqtt.prj.member.service;

import java.util.List;

import co.briiiqtt.prj.member.vo.MemberVO;

public interface MemberService {
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
	
	MemberVO memberLogin(MemberVO vo);
	boolean isIdAlreadyExists(String id);
	
	
}
