package net.board.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.board.db.BoardBean;
import net.board.db.BoardDAO;

public class BoardListAction implements Action{

	@Override
	public net.board.action.ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		BoardDAO bdao=new BoardDAO();
		List<BoardBean> boardlist=new ArrayList<BoardBean>();
		net.board.action.ActionForward forward=new net.board.action.ActionForward();
		
		int page=1;
		int limit=10;
		
		if(request.getParameter("page")!=null) {
			page=Integer.parseInt(request.getParameter("page"));
		}
		System.out.println("넘어온 페이지 : "+page);
		
		HttpSession session=request.getSession();
		if(session.getAttribute("limit")!=null) {
			limit=Integer.parseInt(session.getAttribute("limit").toString());
		}
		if(request.getParameter("limit")!=null) {
			limit=Integer.parseInt(request.getParameter("limit"));
			session.setAttribute("limit", limit);
			System.out.println("limit : "+limit);
		}
		
		int listcount=bdao.getListCount();
		System.out.println("listcount : "+listcount);
		
		boardlist=bdao.getBoardList(page, limit);
		
		int maxpage=(listcount+limit-1)/limit;
		int startpage=((page-1)/limit)*limit+1;
		int endpage=startpage+limit-1;
		if(endpage>maxpage) endpage=maxpage;
		
		request.setAttribute("boardlist", boardlist);
		request.setAttribute("page", page);
		request.setAttribute("maxpage", maxpage);
		request.setAttribute("startpage", startpage);
		request.setAttribute("endpage", endpage);
		request.setAttribute("listcount", listcount);
		
		//forward.setPath("./board/qna_board_list.jsp");
		forward.setRedirect(false);
		
		if(request.getParameter("state") != null) {
			forward.setPath("board/qna_board_list2.jsp");
			System.out.println("Ajax 실행중");
		}else {
			forward.setPath("./member/template.jsp?page=/board/qna_board_list");
		}
		
		return forward;
	}

	
}
