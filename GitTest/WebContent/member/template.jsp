<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String pagefile=request.getParameter("page");
	System.out.println(pagefile);
%>
<!DOCTYPE html>
<html>
	<head>
		<title>Insert title here</title>
		<link href="/Board_ajax/css/template.css" rel="stylesheet" type="text/css">
	</head>
	<body>
		<header>
			<h1><a href="./main.net">»≠¿Ã∆√!~</a></h1><br>
		</header>
		<nav>
			<jsp:include page="header.jsp"/><br><br>
		</nav>
		<div id="wrap">
			<aside>
				<jsp:include page="left.jsp"/>
			</aside>
			<section>
				<%-- <c:if test="${page!=null }">
					<jsp:include page='${page}+".jsp"'/>
				</c:if> --%>
				<%if(pagefile!=null){ %>
					<jsp:include page='<%=pagefile+".jsp" %>'/>
				<%
					}
				 %>
			</section>
		</div>
		
	</body>
</html>