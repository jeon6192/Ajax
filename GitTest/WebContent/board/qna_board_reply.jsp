<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>MVC 게시판 글쓰기</title>
		<link href="/Board_ajax/css/board_write.css" rel="stylesheet" type="text/css">
		<script src="http://code.jquery.com/jquery-latest.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
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
		<form action="./BoardReplyAction.bo" method="post" name="boardform">
			<input type="hidden" name="BOARD_NUM" value="${board.BOARD_NUM }">
			<input type="hidden" name="BOARD_RE_REF" value="${board.BOARD_RE_REF }">
			<input type="hidden" name="BOARD_RE_LEV" value="${board.BOARD_RE_LEV }">
			<input type="hidden" name="BOARD_RE_SEQ" value="${board.BOARD_RE_SEQ }">
			<table>
				<tr class="center">
					<th colspan="2">MVC 게시판 -modify 페이지</th>
				</tr>
				<tr>
					<td><div>글쓴이</div></td>
					<td>
						<input name="BOARD_NAME" id="board_name" readonly="readonly" type="text" size="15" maxlength="30" value="${id}">
					</td>
				</tr>
				<tr>
					<td><div>비밀번호</div></td>
					<td>
						<input name="BOARD_PASS" id="board_pass" type="password" size="15" maxlength="30">
					</td>
				</tr>
				<tr>
					<td><div>제목</div></td>
					<td>
						<input name="BOARD_SUBJECT" id="board_subject" type="text" size="50" maxlength="100" value="Re: ${board.BOARD_SUBJECT }">
					</td>
				</tr>
				<tr>
					<td><div>내용</div></td>
					<td>
						<textarea rows="15" cols="60" name="BOARD_CONTENT" id="board_content"></textarea>
					</td>
				</tr>
				
				<tr class="center">
					<td colspan="2" class="h30 lime">
						<input type="submit" value="등록">
						<input type="reset" value="취소">
				</tr>
				
			</table>
		</form>
		
	</body>
</html>