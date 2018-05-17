package net.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.member.db.Member;
import net.member.db.MemberDAO;

public class Member_infoAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=euc-kr");
		HttpSession session=request.getSession();
		MemberDAO mdao=new MemberDAO();
		Member obj=mdao.member_info((String)session.getAttribute("id"));
		ActionForward forward=new ActionForward();
		
		request.setAttribute("member", obj);
		forward.setPath("./member/template.jsp?page=select");
		forward.setRedirect(false);
		
		return forward;
	}
	
}
