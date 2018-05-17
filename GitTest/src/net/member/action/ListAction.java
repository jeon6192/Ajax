package net.member.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.member.db.Member;
import net.member.db.MemberDAO;

public class ListAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=euc-kr");
		MemberDAO mdao=new MemberDAO();
		List<Member> list=new ArrayList<Member>();
		list=mdao.getList();
		ActionForward forward=new ActionForward();
		
		request.setAttribute("totallist", list);
		forward.setPath("./member/template.jsp?page=member_list");
		forward.setRedirect(false);
		
		return forward;
	}
	
}
