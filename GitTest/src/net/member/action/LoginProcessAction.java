package net.member.action;

import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.member.db.MemberDAO;

public class LoginProcessAction implements Action{
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		String inputId=request.getParameter("id");
		String inputPass=request.getParameter("pass");
		MemberDAO mdao=new MemberDAO();
		int result=mdao.isId(inputId, inputPass);
		String message="";
		PrintWriter out=response.getWriter();
		
		Cookie cookie=null;
		if(request.getParameter("idchk")!=null){
			cookie=new Cookie("remem", inputId);
			cookie.setMaxAge(120); 
			response.addCookie(cookie);
		}
		
		System.out.println("����� "+result);
		
		if(result==1) {
			HttpSession session=request.getSession();
			session.setAttribute("id", inputId);
			message="�α��� ����!";
			out.println("<script>alert('"+message+"'); location.href='main.net';</script>");
			out.close();
			return null;
		}else {
			if(result==0) {
				message="��й�ȣ�� Ʋ����";
			}else {
				message="���̵� �������� ����";
			}
			out.println("<script>alert('"+message+"'); location.href='login.net';</script>");
			out.close();
			return null;
		}
		
	}
	
}
