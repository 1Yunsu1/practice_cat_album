<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.util.*"  %>
<%@ page import = "cat_album.com.dao.*" %>
<%@ page import = "cat_album.com.vo.*" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 리스트 페이지 입니다.</title>
</head>

<style>
	table {
		border : 1px solid black;
	}
	th {
		border : 1px solid black;
	}
	td {
		border : 1px solid black;
	}
</style>

<body>
	<h1>멤버 관리 페이지 입니다.</h1>
	
	<h3><a href="./create.do">회원 생성</a></h3>
 
	<table >
	<thead>
		<tr> 
			<th>NUMBER</th>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>ID</th>
			<th>PASSWORD</th>
			<th>GENDER</th>
			<th>BIRTH</th>
			<th>ADDRESS</th>
			<th>STATE</th>
			<th>GRADE</th>
			<th>UPDATE</th>
			<th>DELETE</th>
		</tr>
	</thead>
	<tbody >
	<%
	List<MemberVo> list = (List<MemberVo>)request.getAttribute("mem_list");
	%>
	<% for(MemberVo mem : list) { %>
		<tr >
			<td><%=mem.getNUMBER() %>   </td>
			<td><%=mem.getNAME() %>  </td>
			<td><%=mem.getEMAIL() %>  </td>
			<td><%=mem.getID() %>  </td>
			<td><%=mem.getPASSWORD() %>  </td>
			<td><%=mem.getGENDER() %>  </td>
			<td><%=mem.getBIRTH() %>  </td>
			<td><%=mem.getADDRESS() %>  </td>
			<td><%=mem.getSTATE() %>  </td>
			<td><%=mem.getGRADE() %></td>
			<td><a href="./update.do?NUMBER=<%=mem.getNUMBER() %>">click</a></td>
			<td><a href="./delete.do?NUMBER=<%=mem.getNUMBER() %>">click</a></td>
		</tr>
		<% } %>
	</tbody>
	</table>
</body>
</html>