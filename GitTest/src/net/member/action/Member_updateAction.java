package net.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.member.db.Member;
import net.member.db.MemberDAO;

public class Member_updateAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		HttpSession session=request.getSession();
		MemberDAO mdao=new MemberDAO();
		Member m=mdao.member_info((String)session.getAttribute("id"));
		ActionForward forward=new ActionForward();
		forward.setPath("./member/updateForm.jsp");
		forward.setRedirect(false);
		
		request.setAttribute("memberinfo", m);
		
		return forward;
	}
	
}
