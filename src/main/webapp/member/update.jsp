<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<%@ page import = "cat_album.com.dao.*" %>
<%@ page import = "cat_album.com.vo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버수정 페이지 입니다.</title>
</head>
<body>
<h1>멤버수정 페이지</h1>
<% MemberVo mem = (MemberVo)request.getAttribute("detail"); %>
<form action="./update.do" method="post" name="MemUpdate">
		<p>
			<label> NUMBER : <input type="text" name="NUMBER" value="<%=mem.getNUMBER() %>" ></label>
		</p>
		<p>
			<label> NAME : <input type="text" name="NAME" value="<%=mem.getNAME() %>"></label>
		</p>
		<p>
			<label> EMAIL : <input type="text" name="EMAIL" value="<%=mem.getEMAIL() %>"></label>
		</p>
		<p>
			<label> ID : <input type="text" name="ID" value="<%=mem.getID() %>"></label>
		</p>
		<p>
			<label> PASSWORD : <input type="text" name="PASSWORD" value="<%=mem.getPASSWORD() %>"></label>
		</p>
		<p>
			<label> GENDER : <input type="text" name="GENDER" value="<%=mem.getGENDER() %>"></label>
		</p>
		<p>
			<label> BIRTH : <input type="text" name="BIRTH" value="<%=mem.getBIRTH() %>"></label>
		</p>
		<p>
			<label> ADDRESS : <input type="text" name="ADDRESS" value="<%=mem.getADDRESS() %>"></label>
		</p>
		<p>
			<label> STATE : <input type="text" name="STATE" value="<%=mem.getSTATE() %>"></label>
		</p>
		<button type="reset">Reset</button>
		<button type="submit">Submit</button>
	</form>

</body>
</html>