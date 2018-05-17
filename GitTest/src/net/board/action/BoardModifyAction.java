package net.board.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board.db.BoardBean;
import net.board.db.BoardDAO;

public class BoardModifyAction implements Action {
	
	@Override
	public net.board.action.ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		net.board.action.ActionForward forward=new net.board.action.ActionForward();
		request.setCharacterEncoding("euc-kr");
		boolean result = false;
	    int num = Integer.parseInt(request.getParameter("BOARD_NUM"));
	    BoardDAO boarddao = new BoardDAO();
	    BoardBean boarddata = new BoardBean();
	      
	    
	    boolean usercheck = 
	          boarddao.isBoardWriter(num,request.getParameter("BOARD_PASS"));
	     
	    if(usercheck ==false) {
	       response.setContentType("text/html;charset=euc-kr");
	       PrintWriter out = response.getWriter();
	       out.println("<script>");
	       out.println("alert('비밀번호가 다릅니다.');");
	       out.println("history.back();");
	       out.println("</script>");
	       out.close();
	       return null;
	    }
	    boarddata.setBOARD_NUM(num);
	    boarddata.setBOARD_SUBJECT(request.getParameter("BOARD_SUBJECT"));
	    boarddata.setBOARD_CONTENT(request.getParameter("BOARD_CONTENT"));
	     
	    result = boarddao.boardModify(boarddata);
	      
	    if(result == false) {
	       System.out.println("게시판 수정 실패");
	       return null;
	    }
	    System.out.println("게시판 수정완료");
	    
	    forward.setRedirect(true);
	    forward.setPath("./BoardDetailAction.bo?num=" + boarddata.getBOARD_NUM());
	      
	    return forward;
	}

	

}
