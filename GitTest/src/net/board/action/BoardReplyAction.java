package net.board.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board.db.BoardBean;
import net.board.db.BoardDAO;

public class BoardReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		BoardDAO bdao=new BoardDAO();
		//BoardDAO_sequence bdao_seq=new BoardDAO_sequence();
		BoardBean board=new BoardBean();
		net.board.action.ActionForward forward=new net.board.action.ActionForward();
		board.setBOARD_NUM(Integer.parseInt(request.getParameter("BOARD_NUM")));
		board.setBOARD_RE_REF(Integer.parseInt(request.getParameter("BOARD_RE_REF")));
		board.setBOARD_RE_LEV(Integer.parseInt(request.getParameter("BOARD_RE_LEV")));
		board.setBOARD_RE_SEQ(Integer.parseInt(request.getParameter("BOARD_RE_SEQ")));
		board.setBOARD_NAME(request.getParameter("BOARD_NAME"));
		board.setBOARD_PASS(request.getParameter("BOARD_PASS"));
		board.setBOARD_SUBJECT(request.getParameter("BOARD_SUBJECT"));
		board.setBOARD_CONTENT(request.getParameter("BOARD_CONTENT"));
		
		int result=bdao.boardReply(board);
		
		if(result==0) {
			PrintWriter out=response.getWriter();
			out.println("<script> alert('답글 입력 실패!'); history.back();</script>");
		} 
		System.out.println("답글 달기 성공!");
		forward.setRedirect(true);
		forward.setPath("./BoardList.bo");
		//forward.setPath("./BoardDetailAction.bo?num="+result);
		
		return forward;
	}

}
