package co.briiiqtt.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.briiiqtt.board.notice.service.NoticeService;
import co.briiiqtt.board.notice.service.NoticeVO;
import co.briiiqtt.board.notice.serviceimpl.NoticeServiceImpl;

public class NoticeSelect implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//하나의 게시글을 조회한다.
		NoticeService noticeDAO = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setnId(Integer.valueOf(request.getParameter("nid")));
		vo = noticeDAO.noticeSelect(vo);
		request.setAttribute("notice", vo);
		return "notice/noticeSelect";
	}

}
