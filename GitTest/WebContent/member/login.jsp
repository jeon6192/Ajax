<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Insert title here</title>
		<link href="/Board_ajax/css/login.css" rel="stylesheet" type="text/css">
		<script src="http://code.jquery.com/jquery-latest.js"></script>
		<script>
			$(document).ready(function(){
		    	<%
		    		Cookie[] cookies=request.getCookies();
		    		if(cookies!=null&&cookies.length>0){
		    			for(int i=0;i<cookies.length;i++){
		    				if(cookies[i].getName().equals("remem")){
		    					%>
			    				$('[name="id"]').val("<%=cookies[i].getValue()%>");
			    				$('[name="idchk"]').attr('checked', 'checked');
			    				<%
		    				}
		    			}
		    		}
		    	%>
			});
		</script>
	</head>
	<body>
		<form action="loginProcess.net" method="post">
			<label>���̵� : </label><input type="text" name="id" id="id" required>
			<input type="checkbox" value="remem" name="idchk"> <b style="color: #ff3d00">ID ����ϱ�</b><br>
			<label>��й�ȣ : </label><input type="password" name="pass" required><br>
			<input type="submit" value="���¿�">
		</form>
		
	</body>
</html>