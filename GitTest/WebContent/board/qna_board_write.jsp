<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>MVC �Խ��� �۾���</title>
		<link href="/Board_ajax/css/board_write.css" rel="stylesheet" type="text/css">
		<script src="http://code.jquery.com/jquery-latest.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				if(${id==null}){
					alert('�α����� ��');
					history.back();
				}
				$('input[type=reset]').click( function() {
					history.back();
				});
			});
		</script>
	</head>
	<body>
		<nav>
			<%@ include file="/member/header.jsp" %>
		</nav>
		<br><br>
		<form action="./BoardAddAction.bo" method="post" enctype="multipart/form-data" name="boardform">
			<table>
				<tr class="center">
					<th colspan="2">MVC �Խ��� -write ������</th>
				</tr>
				<tr>
					<td><div>�۾���</div></td>
					<td>
						<input name="BOARD_NAME" id="board_name" readonly="readonly" type="text" size="15" maxlength="30" value="${id}">
					</td>
				</tr>
				<tr>
					<td><div>��й�ȣ</div></td>
					<td>
						<input name="BOARD_PASS" id="board_pass" type="password" size="15" maxlength="30">
					</td>
				</tr>
				<tr>
					<td><div>����</div></td>
					<td>
						<input name="BOARD_SUBJECT" id="board_subject" type="text" size="50" maxlength="100">
					</td>
				</tr>
				<tr>
					<td><div>����</div></td>
					<td>
						<textarea rows="15" cols="60" name="BOARD_CONTENT" id="board_content"></textarea>
					</td>
				</tr>
				<tr>
					<td><div>���� ÷��</div></td>
					<td>
						<input name="BOARD_FILE" id="upfile" type="file">
					</td>
				</tr>
				
				<tr class="center">
					<td colspan="2" class="h30 lime">
						<input type="submit" value="���">
						<input type="reset" value="���">
				</tr>
				
			</table>
		</form>
		
	</body>
</html>