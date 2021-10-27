package co.briiiqtt.command;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.briiiqtt.board.notice.service.NoticeService;
import co.briiiqtt.board.notice.service.NoticeVO;
import co.briiiqtt.board.notice.serviceimpl.NoticeServiceImpl;

public class NoticeInsert implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//게시글 저장
		NoticeService noticeDAO = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setId(request.getParameter("id"));
		vo.setName(request.getParameter("name"));
		vo.setWriteDate(Date.valueOf(request.getParameter("writeDate")));
		vo.setTitle(request.getParameter("title"));
		vo.setContents(request.getParameter("contents"));
		int n = noticeDAO.noticeInsert(vo);
		String viewPage = null;
		if(n!=0) {
			viewPage = "noticeList.do";
		}else {
			request.setAttribute("message", "등록에 실패하였씁니다.");
			viewPage="notic/noticeFail";
		}
		return viewPage;
	}

}
