package net.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board.db.BoardBean;
import net.board.db.BoardDAO;

public class BoardModifyView implements Action{
	@Override
	   public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		int num=Integer.parseInt(request.getParameter("num"));
		BoardDAO bdao=new BoardDAO();
		BoardBean board=new BoardBean();
		net.board.action.ActionForward forward=new net.board.action.ActionForward();
		
		board=bdao.getDetail(num);
		
		if(board==null) {
			System.out.println("수정 페이지 이동 실패");
			return null;
		}
		System.out.println("수정 페이지 이동 완료");
		
		request.setAttribute("board", board);
		
		forward.setPath("./board/qna_board_modifyForm.jsp");
		forward.setRedirect(false);
		
	      return forward;
	}
	   

}
