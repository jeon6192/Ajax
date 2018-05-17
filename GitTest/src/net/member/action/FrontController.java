package net.member.action;

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
@WebServlet("*.net")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public FrontController() {
        super();
    }

    @SuppressWarnings("null")
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
			if(command.equals("/login.net")) {
				forward=new ActionForward();
				forward.setPath("./member/login.jsp");
				forward.setRedirect(false);
			}else if(command.equals("/loginProcess.net")) {
				action=new LoginProcessAction();
				forward=action.execute(request, response);
			}else if(command.equals("/logout.net")){
				action=new LogoutAction();
				forward=action.execute(request, response);
			}else if(command.equals("/join.net")) {
				forward=new ActionForward();
				forward.setPath("./member/join2.jsp");
				forward.setRedirect(false);
			}else if(command.equals("/joinProcess.net")) {
				action=new JoinProcessAction();
				forward=action.execute(request, response);
			}else if(command.equals("/main.net")) {
				forward=new ActionForward();
				forward.setPath("./member/template.jsp");
				forward.setRedirect(false);
			}else if(command.equals("/user_info.net")) {
				action=new Member_infoAction();
				forward=action.execute(request, response);
			}else if(command.equals("/member_list.net")) {
				action=new ListAction();
				forward=action.execute(request, response);
			}else if(command.equals("/member_delete.net")) {
				action=new Member_deleteAction();
				forward=action.execute(request, response);
			}else if(command.equals("/member_update.net")) {
				action=new Member_updateAction();
				forward=action.execute(request, response);
			}else if(command.equals("/updateProcess.net")) {
				action=new UpdateProcessAction();
				forward=action.execute(request, response);
			}else if(command.equals("/idcheck.net")) {
				action=new IdCheckAction();
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
