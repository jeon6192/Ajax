package net.member.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.member.db.Member;
import net.member.db.MemberDAO;

public class JoinProcessAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Member m=new Member();
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		m.setId((String) request.getParameter("id"));
		m.setPassword(((String) request.getParameter("password")));
		m.setName(((String) request.getParameter("name")));
		m.setAge(Integer.parseInt(request.getParameter("age")));
		m.setGender((String) request.getParameter("gender"));
		String email=request.getParameter("email");
		String domain=request.getParameter("domain");
		m.setEmail(email+"@"+domain);
		
		MemberDAO mdao=new MemberDAO();
		int result=mdao.insert(m);
		PrintWriter out=response.getWriter();
		if(result==1) {
			out.println("<script> alert('가입 성공!'); location.href='main.net';</script>");
		}else {
			out.println("<script> alert('아이디 중복!!'); history.back();</script>");
		}
		out.close();
		
		return null;
	}
	
}
