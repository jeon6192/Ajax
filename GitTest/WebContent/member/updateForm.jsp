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
            <legend>회원가입</legend>
            <c:set var="m" value="${memberinfo }"/>
            <form  name=joinform method=post action=updateProcess.net>
                <br><label>아이디</label><input type=text name=id id=id style='width: 250px;' value=${m.id } readonly><br><br>
                <label>비밀번호</label><input type=password name=pass id=pass value=${m.password } readonly><br><br>
                <label>이름</label><input type=text name=name id=name value="${m.name }"><br><br>
                <label>나이</label><input type=text name=age id=age maxlength="2" value=${m.age }><br><br>
                <label>성별</label><span>
         			<input type=radio name=gender id=gender1 value="남" <c:if test="${m.gender.equals('남') }">checked</c:if>>남자
            		<input type=radio name=gender id=gender2 value="여" <c:if test="${m.gender.equals('여') }">checked</c:if>>여자
            	</span><br><br>
            	<c:set var="item" value="${fn:split(m.email,'@') }"/>
            	<label>E-Mail</label><input type=text name=email id=email size=10 value=${item[0] }>@
               	<input type=text name=domain id=domain size=10 value=${item[1] }>
                <select name=sel id=sel>
                    <option value="">직접입력</option>
                    <option value="naver.com">naver.com</option>
                    <option value="daum.net">daum.net</option>
                    <option value="nate.com">nate.com</option>
                    <option value="gmail.com">gmail.com</option>
                </select>
                <br><br><br>
                <div class="clearfix">
	                <input type=submit value="수정" id="submit">
	                <input type=reset value="취소">
                </div>
            </form>
            <!-- <script type="text/javascript">
            var pandan ='${m.gender}';
            if(pandan=='남'){
               $("input:radio").eq(0).attr('checked', 'checked');      
            }else {
               $("input:radio").eq(1).attr('checked', 'checked');
            }
            </script> -->
        </fieldset>
	</body>
</html>

