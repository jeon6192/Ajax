package net.member.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutAction implements Action{

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		session.invalidate(); 
		out.println("<script>alert('·Î±×¾Æ¿ô µÊ¤»'); location.href='main.net'</script>");
		return null;
	}
	
}
