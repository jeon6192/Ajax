<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Insert title here</title>
		<link href="/Board_ajax/css/board_write.css" rel="stylesheet" type="text/css">
		<script type="text/javascript">
		  	function deleteConfirm(){
				//확인후 삭제액션 실행
			   	ans=confirm("삭제하시겠습니까?");
			   	if(ans){
			   	    location.href="<c:url value='/BoardDelete.bo?num=${board.BOARD_NUM}'/>";
					return;
			   	}
			   	alert("삭제가 취소됨!!");
			 }
 		</script>
	</head>
	<body>
		<br><br>
		<form action="./BoardAddAction.bo" method="post" enctype="multipart/form-data" name="boardform">
			<table>
				<tr class="center">
					<th colspan="2">MVC 게시판 -view 페이지</th>
				</tr>
				<tr>
					<td><div>글쓴이</div></td>
					<td>
						<div>${board.BOARD_NAME }</div>
					</td>
				</tr>
				<tr>
					<td><div>제목</div></td>
					<td><div>${board.BOARD_SUBJECT }</div>	</td>
				</tr>
				<tr>
					<td><div>내용</div></td>
					<td><div>${board.BOARD_CONTENT }</div></td>
				</tr>
				<tr>
					<td><div>첨부 파일</div></td>
					<td>
					<c:if test="${!empty board.BOARD_FILE}">
						<img width="10px" src="image/down.png">
						<a href="./BoardFileDown.bo?filename=${board.BOARD_FILE }">${board.BOARD_FILE }</a>
					</c:if>
					</td>
				</tr>
				
				<tr class="center">
					<td colspan="2" class="h30 lime">
						<a href="<c:url value='/BoardReplyView.bo?num=${board.BOARD_NUM }'/>">
					    	<img src="/Board/image/reply.png">
					    </a>&nbsp;
					    <c:if test="${id=='admin'||id==board.BOARD_NAME }">
					    	<a href="<c:url value='/BoardModifyView.bo?num=${board.BOARD_NUM}'/>">
								<img src="/Board/image/update.png">
							</a>&nbsp;
							<a href="javascript:deleteConfirm()">
								<img src="/Board/image/delete.png">
							</a>&nbsp;
						</c:if>
						<a href="<c:url value='/BoardList.bo'/>">
							<img src="/Board/image/list.png">
						</a>&nbsp;
				</tr>
				
			</table>
		</form>
	</body>
</html>