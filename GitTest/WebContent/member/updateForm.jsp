<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Title</title>
        <link href="/Board_ajax/css/join.css" rel="stylesheet" type="text/css">
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script src="/Board_ajax/js/join.js"></script>
    </head>
    <body>
        <fieldset>
            <legend>ȸ������</legend>
            <c:set var="m" value="${memberinfo }"/>
            <form  name=joinform method=post action=updateProcess.net>
                <br><label>���̵�</label><input type=text name=id id=id style='width: 250px;' value=${m.id } readonly><br><br>
                <label>��й�ȣ</label><input type=password name=pass id=pass value=${m.password } readonly><br><br>
                <label>�̸�</label><input type=text name=name id=name value="${m.name }"><br><br>
                <label>����</label><input type=text name=age id=age maxlength="2" value=${m.age }><br><br>
                <label>����</label><span>
         			<input type=radio name=gender id=gender1 value="��" <c:if test="${m.gender.equals('��') }">checked</c:if>>����
            		<input type=radio name=gender id=gender2 value="��" <c:if test="${m.gender.equals('��') }">checked</c:if>>����
            	</span><br><br>
            	<c:set var="item" value="${fn:split(m.email,'@') }"/>
            	<label>E-Mail</label><input type=text name=email id=email size=10 value=${item[0] }>@
               	<input type=text name=domain id=domain size=10 value=${item[1] }>
                <select name=sel id=sel>
                    <option value="">�����Է�</option>
                    <option value="naver.com">naver.com</option>
                    <option value="daum.net">daum.net</option>
                    <option value="nate.com">nate.com</option>
                    <option value="gmail.com">gmail.com</option>
                </select>
                <br><br><br>
                <div class="clearfix">
	                <input type=submit value="����" id="submit">
	                <input type=reset value="���">
                </div>
            </form>
            <!-- <script type="text/javascript">
            var pandan ='${m.gender}';
            if(pandan=='��'){
               $("input:radio").eq(0).attr('checked', 'checked');      
            }else {
               $("input:radio").eq(1).attr('checked', 'checked');
            }
            </script> -->
        </fieldset>
	</body>
</html>

