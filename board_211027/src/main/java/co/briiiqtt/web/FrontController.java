package co.briiiqtt.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.briiiqtt.command.Command;
import co.briiiqtt.command.HomeCommand;
import co.briiiqtt.command.MemberJoin;
import co.briiiqtt.command.MemberJoinForm;
import co.briiiqtt.command.MemberLogin;
import co.briiiqtt.command.MemberLoginForm;
import co.briiiqtt.command.MemberLogout;
import co.briiiqtt.command.MemberSelectList;
import co.briiiqtt.command.MemberSelfInfo;
import co.briiiqtt.command.NoticeDelete;
import co.briiiqtt.command.NoticeEdit;
import co.briiiqtt.command.NoticeForm;
import co.briiiqtt.command.NoticeInsert;
import co.briiiqtt.command.NoticeList;
import co.briiiqtt.command.NoticeSelect;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String, Command> map = new HashMap<String, Command>();
    public FrontController() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		//수행할 Command를 넣어두는 곳
		map.put("/home.do", new HomeCommand());	//홈
		map.put("/noticeList.do", new NoticeList());	//공지사항목록
		map.put("/noticeSelect.do", new NoticeSelect());	//세부내역 보기
		map.put("/noticeForm.do", new NoticeForm());
		map.put("/noticeInsert.do",	new NoticeInsert());	//게시글 저장
		map.put("/noticeDelete.do",	new NoticeDelete());	//게시글 삭제
		//
		map.put("/memberSelectList.do", new MemberSelectList());	//������
		map.put("/memberLoginForm.do", new MemberLoginForm());
		map.put("/memberLogin.do", new MemberLogin());	//�α��� ó��
		map.put("/memberLogout.do", new MemberLogout());	//�α��� ó��
		map.put("/memberJoinForm.do", new MemberJoinForm());	//�α��� ó��
		map.put("/memberJoin.do", new MemberJoin());	//�α��� ó��
		map.put("/memberSelfInfo.do", new MemberSelfInfo());	//�α��� ó��
		map.put("/noticeEdit.do", new NoticeEdit());
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청을 분석하고, 수행할 command를 찾아 실행하고 결과를 보여줄 페이지를 선택한다.
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String page = uri.substring(contextPath.length());
		System.out.println(page);
		Command command = map.get(page);
		String viewPage = command.run(request, response);
		if(!viewPage.endsWith(".do")) {
			viewPage="/WEB-INF/views/"+viewPage+".jsp";
		}
		System.out.println(viewPage);
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
		
	}

}
