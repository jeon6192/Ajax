package net.board.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import net.board.db.BoardBean;
import net.board.db.BoardDAO;

public class BoardAddAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		PrintWriter out=response.getWriter();
			
		BoardDAO bdao=new BoardDAO();
		//BoardDAO_sequence bdao_seq=new BoardDAO_sequence();
		ActionForward forward=new ActionForward();
		BoardBean board=new BoardBean();
		
		String realFolder="";
		String saveFolder="boardupload";
		
		int fileSize=10*1024*1024;
		
		// 실제 저장 경로 지정
		realFolder=request.getSession().getServletContext().getRealPath(saveFolder);
		
		System.out.println("realFolder : "+realFolder);
		boolean result=false;
		
		try{
			MultipartRequest multi=new MultipartRequest(request, realFolder, fileSize, "euc-kr", new DefaultFileRenamePolicy());
			
			board.setBOARD_NAME(multi.getParameter("BOARD_NAME"));
			board.setBOARD_PASS(multi.getParameter("BOARD_PASS"));
			board.setBOARD_SUBJECT(multi.getParameter("BOARD_SUBJECT"));
			board.setBOARD_CONTENT(multi.getParameter("BOARD_CONTENT"));
			board.setBOARD_FILE(multi.getFilesystemName((String)multi.getFileNames().nextElement()));
			
			result=bdao.boardInsert(board);
			if(result) {
				forward.setRedirect(true);
				forward.setPath("./BoardList.bo");
				return forward;
			}else {
				out.println("<script> alert('입력 실패!'); history.back();</script>");
			}
			out.close();
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return null;
	}

}
