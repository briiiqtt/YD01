package co.briiiqtt.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.briiiqtt.board.notice.service.NoticeService;
import co.briiiqtt.board.notice.service.NoticeVO;
import co.briiiqtt.board.notice.serviceimpl.NoticeServiceImpl;

public class NoticeDelete implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		NoticeService noticeDAO = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setnId(Integer.valueOf(request.getParameter("nId")));
		int n = noticeDAO.noticeDelete(vo);
		String viewPage = null;
		if(n != 0) {
			viewPage = "noticeList.do";
		}else {
			request.setAttribute("message", "삭제 실패ㅐㅐㅐㅐㅐ");
			viewPage = "notice/noticeFail";
		}
		return viewPage;
	}

}
