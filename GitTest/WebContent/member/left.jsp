<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<a href="BoardList.bo">�Խ���</a>
<a href="user_info.net">�� ���� ����</a>
<c:if test="${id!=null&&id.equals('admin')}">
	<a href='member_list.net'>ȸ������ ����</a>
</c:if>


