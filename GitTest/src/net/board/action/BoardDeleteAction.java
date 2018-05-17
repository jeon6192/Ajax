package net.board.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board.db.BoardDAO;

public class BoardDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("euc-kr");
		boolean result=false;
		boolean usercheck=false;
		int num=Integer.parseInt(request.getParameter("num"));
		System.out.println("delete num : "+num);
		BoardDAO bdao=new BoardDAO();
		
		usercheck=bdao.isBoardWriter(num, request.getParameter("BOARD_PASS"));
		
		if(usercheck==false) {
			response.setContentType("text/html;charset=euc-kr"); 
			PrintWriter out=response.getWriter();
			out.println("<script>alert('비밀번호가 다릅니다.'); history.back(); </script>");
			out.close();
			return null;
		}
		
		result=bdao.boardDelete(num);
		
		if(result==false) {
			System.out.println("삭제 실패");
			return null;
		}
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out=response.getWriter();
		out.println("<script> alert('삭제완료!'); location.href='./BoardList.bo'; </script>");
		out.close();
		
		return null;
	}

}
