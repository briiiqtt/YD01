package co.briiiqtt.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.briiiqtt.board.notice.service.NoticeService;
import co.briiiqtt.board.notice.service.NoticeVO;
import co.briiiqtt.board.notice.serviceimpl.NoticeServiceImpl;

public class NoticeEdit implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		NoticeService noticeDAO = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setnId(Integer.valueOf(request.getParameter("nId")));
		vo.setTitle(request.getParameter("modTitle"));
		vo.setContents(request.getParameter("modContents"));
		int n = noticeDAO.noticeUpdate(vo);
		if(n!=1) {
			request.setAttribute("message", "수정실패");
			return "notice/noticeFail";
		}
		return "/noticeList.do";
	}

}
