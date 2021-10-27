package co.briiiqtt.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.briiiqtt.board.notice.service.NoticeService;
import co.briiiqtt.board.notice.service.NoticeVO;
import co.briiiqtt.board.notice.serviceimpl.NoticeServiceImpl;

public class NoticeList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//공지사항목록
		NoticeService noticeDAO = new NoticeServiceImpl();
		List<NoticeVO> list = new ArrayList<NoticeVO>();
		list = noticeDAO.noticeSelectList();
		request.setAttribute("notices", list);	//결과를 담아둔다
		return "notice/noticeList";
	}

}
