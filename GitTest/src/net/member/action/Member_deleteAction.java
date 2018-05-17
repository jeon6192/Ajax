package net.member.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.member.db.MemberDAO;

public class Member_deleteAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		if(id.equals("admin")) {
			out.println("<script>alert('包府绰 昏力 x'); history.back();</script>");
			return null;
		}
		MemberDAO mdao=new MemberDAO();
		mdao.delete(id);
		String message="";
		
		message="昏力 己傍!";
		out.println("<script>alert('"+message+"'); location.href='./member_list.net';</script>");
		out.close();
		
		return null;
	}
	
}
