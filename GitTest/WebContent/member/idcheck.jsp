<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<link href="/Board_ajax/css/idchk.css" rel="stylesheet" type="text/css">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(document).ready(function(){
		$('#btn').on('click', function(){
			window.close();[]
		});
	});
</script>
<div>
	<h3>
		<c:choose>
			<c:when test="${id.equals(chkId)}">
				���̵� �ߺ�<font color=red>!</font>
			</c:when>
			<c:otherwise>
				���̵� ��밡��<font color=red>!</font>
			</c:otherwise>
		</c:choose>
	</h3>
	<button id=btn>Ȯ��</button>
</div>