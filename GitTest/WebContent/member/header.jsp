<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Insert title here</title>
	</head>
	<body>
		<div class="right">
			<c:choose>
				<c:when test="${id!=null }">
					<c:choose>
					<c:when test="${id=='admin' }">
						������ ${id }�� ȯ���մϴ�.
					</c:when>
					<c:otherwise>
						�Ϲ�ȸ�� ${id }�� ȯ���մϴ�.
					</c:otherwise>
					</c:choose>
					<!-- <a href='updateForm.jsp'>��������</a> -->
					<a href='member_update.net'>��������</a>
					<a href="logout.net">�α׾ƿ�</a>
				</c:when>
				<c:otherwise>
					<a href="login.net">�α���</a>
				</c:otherwise>
			</c:choose>
			 <%-- <%if(id!=null){
    				if(id.equals("admin")){ 
						%> ������ <%=id %>�� ȯ���մϴ�.<%
						}else{
							 %> �Ϲ�ȸ�� <%=id %>�� ȯ���մϴ�.
						<%
						}
    				out.println("<a href='updateForm.jsp'>��������</a>");
    			%>
    			<a href="logout.net">�α׾ƿ�</a>
			<%}else{ %>
				<a href="login.net">�α���</a>
			<%} %> --%>
			<a href="join.net">ȸ������</a>
		</div>
	</body>
</html>