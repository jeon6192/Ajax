package net.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board.db.BoardBean;
import net.board.db.BoardDAO;

public class BoardDetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		BoardDAO bdao=new BoardDAO();
		net.board.action.ActionForward forward=new net.board.action.ActionForward();
		
		int num=Integer.parseInt(request.getParameter("num"));
		BoardBean board=new BoardBean();
		
		bdao.setReadCountUpdate(num);
		board=bdao.getDetail(num);
		
		request.setAttribute("board", board);
		
		System.out.println("request.getParameter(\"page\") : "+request.getParameter("page"));
		
		if(board==null) {
			System.out.println("상세보기 실패!");
			return null;
		}else {
			System.out.println("상세보기 성공!");
			forward.setRedirect(false);
			forward.setPath("./member/template.jsp?page=/board/qna_board_view");
		}
		
		return forward;
	}

}
