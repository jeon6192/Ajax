<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<table>
	<tr>
		<td>���̵�</td><td>��й�ȣ</td><td>�̸�</td><td>����</td><td>����</td><td>�̸���</td>
	</tr>
	<tr>
		<td>${member.getId()}</td>
		<td>${member.getPassword() }</td>
		<td>${member.getName() }</td>
		<td>${member.getAge() }</td>
		<td>${member.getGender() }</td>
		<td>${member.getEmail() }</td>
	</tr>
</table>