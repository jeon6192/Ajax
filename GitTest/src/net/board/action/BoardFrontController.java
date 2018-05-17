package net.board.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.bo")
public class BoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public BoardFrontController() {
        super();
    }

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String requestURI = request.getRequestURI();
		System.out.println("URI주소 : "+requestURI);
		String contextPath = request.getContextPath();
		System.out.println("context주소 : "+contextPath);
		System.out.println("프로젝트 주소길이 : "+contextPath.length());
		String command = requestURI.substring(contextPath.length());
		System.out.println("가상주소뽑기 : "+command);
		
		Action action=null;
		ActionForward forward=null;
		
		try {
			if(command.equals("/BoardList.bo")) {
				action=new BoardListAction();
				forward=action.execute(request, response);
			}else if(command.equals("/BoardWrite.bo")) {
				forward=new ActionForward();
				forward.setRedirect(false);
				forward.setPath("/board/qna_board_write.jsp");
			}else if(command.equals("/BoardAddAction.bo")) {
				action=new BoardAddAction();
				forward=action.execute(request, response);
			}else if(command.equals("/BoardDetailAction.bo")) {
				action=new BoardDetailAction();
				forward=action.execute(request, response);
			}else if(command.equals("/BoardReplyView.bo")) {
				action=new BoardReplyView();
				forward=action.execute(request, response);
			}else if(command.equals("/BoardReplyAction.bo")) {
				action=new BoardReplyAction();
				forward=action.execute(request, response);
			}else if(command.equals("/BoardModifyView.bo")) {
				action=new BoardModifyView();
				forward=action.execute(request, response);
			}else if(command.equals("/BoardModifyAction.bo")) {
				action=new BoardModifyAction();
				forward=action.execute(request, response);
			}else if(command.equals("/BoardDelete.bo")) {
				forward= new ActionForward();
				forward.setRedirect(false);
			    forward.setPath("/board/qna_board_delete.jsp");
			}else if(command.equals("/BoardDeleteAction.bo")) {
				action=new BoardDeleteAction();
				forward=action.execute(request, response);
			}else if(command.equals("/BoardFileDown.bo")) {
				action=new BoardFileDownAction();
				forward=action.execute(request, response);
			}
				
			
			if(forward!=null) {
				if(forward.isRedirect()) {
					response.sendRedirect(forward.getPath());
				}else {
					RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
					dispatcher.forward(request, response);
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}	// doProcess
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	

}
