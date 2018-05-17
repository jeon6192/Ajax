<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${listcount>=1}">
	<tr>
		<th colspan="3">MVC �Խ��� - list</th>
		<th colspan="2">�� ���� : ${listcount }</th>
	</tr>
	<tr>
		<th width="8%"><div>��ȣ</div></th>
		<th width="50%"><div>����</div></th>
		<th width="14%"><div>�ۼ���</div></th>
		<th width="17%"><div>��¥</div></th>
		<th width="11%"><div>��ȸ��</div></th>
	</tr>


	<c:set var="num" value="${listcount-(page-1)*limit }" />
	<c:forEach var="board" items="${boardlist }">
		<tr>
			<td><c:out value="${num }" /> <c:set var="num" value="${num-1 }" />
			</td>
			<td style="text-align: left;">
				<div>
					<c:if test="${board.BOARD_RE_LEV!=0 }">
						<c:forEach var="a" begin="0" end="${board.BOARD_RE_LEV*2 }"
							step="1">
										&nbsp;
									</c:forEach>
					</c:if>
					<c:if test="${board.BOARD_RE_LEV==0 }">
									&nbsp;
								</c:if>
					<a href="./BoardDetailAction.bo?num=${board.BOARD_NUM }">
						${board.BOARD_SUBJECT } </a>
				</div>
			</td>
			<td><div>${board.BOARD_NAME }</div></td>
			<td><div>${board.BOARD_DATE }</div></td>
			<td><div>${board.BOARD_READCOUNT }</div></td>
		</tr>
	</c:forEach>

	<tr class="h30 lime center btn">
		<td colspan="5"><c:if test="${page<=1 }">
							����&nbsp;
						</c:if> <c:if test="${page>1 }">
				<a href="./BoardList.bo?page=${page-1 }">����</a>&nbsp;
						</c:if> <c:forEach var="a" begin="${startpage }" end="${endpage }">
				<c:if test="${a==page }">
								${a }
							</c:if>
				<c:if test="${a!=page }">
					<a href="./BoardList.bo?page=${a }">${a }</a>
				</c:if>
			</c:forEach> <c:if test="${page>=maxpage }">
							&nbsp;����
						</c:if> <c:if test="${page<maxpage }">
							&nbsp;<a href="./BoardList.bo?page=${page+1 }">����</a>
			</c:if></td>
	</tr>

</c:if>
