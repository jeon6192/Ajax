<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>MVC 게시판</title>
		<link href="/Board_ajax/css/board_list.css" rel="stylesheet" type="text/css">
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script src="/Board_ajax/js/boardlist.js"></script>
	</head>
	<body>
		<table>
			<c:if test="${listcount>=1}">
				<tr class="tr_first">
					<th colspan="3">MVC 게시판 - list</th>
					<th colspan="2">글 개수 : ${listcount }</th>
				</tr>
				<tr class="tr_second">
					<th width="8%"><div>번호</div></th>
					<th width="50%"><div>제목</div></th>
					<th width="14%"><div>작성자</div></th>
					<th width="17%"><div>날짜</div></th>
					<th width="11%"><div>조회수</div></th>
				</tr>
				
				
				<c:set var="num" value="${listcount-(page-1)*limit }"/>
				<c:forEach var="board" items="${boardlist }">
					<tr>
						<td>
							<c:out value="${num }"/>
							<c:set var="num" value="${num-1 }"/>
						</td>
						<td style="text-align: left;">
							<div>
								<c:if test="${board.BOARD_RE_LEV!=0 }">
									<c:forEach var="a" begin="0" end="${board.BOARD_RE_LEV*2 }" step="1">
										&nbsp;
									</c:forEach>
								</c:if>
								<c:if test="${board.BOARD_RE_LEV==0 }">
									&nbsp;
								</c:if>
								<a href="./BoardDetailAction.bo?num=${board.BOARD_NUM }">
									${board.BOARD_SUBJECT }
								</a>
							</div>
						</td>
						<td><div>${board.BOARD_NAME }</div></td>
						<td><div>${board.BOARD_DATE }</div></td>
						<td><div>${board.BOARD_READCOUNT }</div></td>
					</tr>
				</c:forEach>
				
				<tr class="h30 lime center btn">
					<td colspan="5">
						<c:if test="${page<=1 }">
							이전&nbsp;
						</c:if>
						<c:if test="${page>1 }">
							<a href="./BoardList.bo?page=${page-1 }">이전</a>&nbsp;
						</c:if>
						
						<c:forEach var="a" begin="${startpage }" end="${endpage }">
							<c:if test="${a==page }">
								${a }
							</c:if>
							<c:if test="${a!=page }">
								<a href="./BoardList.bo?page=${a }">${a }</a>
							</c:if>
						</c:forEach>
						
						<c:if test="${page>=maxpage }">
							&nbsp;다음
						</c:if>
						<c:if test="${page<maxpage }">
							&nbsp;<a href="./BoardList.bo?page=${page+1 }">다음</a>
						</c:if>
						
					</td>
				</tr>
				
			</c:if>
		</table>
		<table>
			<c:if test="${listcount==0}">
				<tr class="tr_first">
					<td colspan="4">MVC 게시판</td>
					<td style="text-align:right;"><font style="margin-right:15px;" size=2>등록된 글이 없습니다.</font></td>
				</tr>
			</c:if>
				<tr style="background-color: #a5ffaf;">
					<td colspan="4" style="text-align:right; font-size: 14pt;"><a style="margin-right:10px;" href="./BoardWrite.bo">[글쓰기]</a></td>
					<td style="width: 100px;">
						<select id="viewcount">
							<option value="3">3줄보기</option>
							<option value="5">5줄보기</option>
							<option value="7">7줄보기</option>
							<option value="10" selected>10줄보기</option>
						</select>
					</td>
				</tr>
		</table>
	</body>
</html>