<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <meta charset="euc-kr">
        <title>Title</title>
        <link href="/Board_ajax/css/join.css" rel="stylesheet" type="text/css">
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script src="/Board_ajax/js/join.js"></script>
    </head>
    <body>
        <fieldset>
            <legend>ȸ������</legend>
            <form  name=joinform method=post action=joinProcess.net>
            	<br><pre id="checkId"></pre>
                <label>���̵�</label><input type=text name=id id=id placeholder="Enter id">
                <input type=button value="ID�ߺ��˻�" id=idcheck><br><br>
                <label>��й�ȣ</label><input type=password name=password id=password><br><br>
                <label>�̸�</label><input type=text name=name id=name placeholder="Enter age"><br><br>
                <label>����</label><input type=text name=age id=age maxlength="2"><br><br>
                <label>����</label><span>
         			<input type=radio name=gender id=gender1 value="��" checked>����
            		<input type=radio name=gender id=gender2 value="��">����
            	</span><br><br>
                <label>E-Mail</label><input type=text name=email id=email size=10>@
                <input type=text name=domain id=domain size=10>
                <select name=sel id=sel>
                    <option value="">�����Է�</option>
                    <option value="naver.com">naver.com</option>
                    <option value="daum.net">daum.net</option>
                    <option value="nate.com">nate.com</option>
                    <option value="gmail.com">gmail.com</option>
                </select>
                <br><br><br>
                <div class="clearfix">
	                <input type=submit value="ȸ������" id="submit">
	                <input type=reset value="���">
                </div>
            </form>
        </fieldset>
    </body>
</html>