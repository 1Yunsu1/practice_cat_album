<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*"  %>
<%@ page import = "cat_album.com.dao.*" %>
<%@ page import = "cat_album.com.vo.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고양이 사진입니다.</title>
</head>
<% 
	List<ImagesVo> I_list = (List<ImagesVo>)request.getAttribute("I_list"); 
%>

<style>
	h1{
		position : relative;
		left: 50%;
		transform : translate(-10%, 0%);
		padding-top: 10px;
		padding-bottom: 10px;
	}
	
	div {
		width: 100%;
	}
	table {
		width: 100%;
		text-align: center;
	}


</style>
<body>
	<h1><%=(String)session.getAttribute("ID")%>님의 고양이 사진</h1>
	<%@ include file="/Header_nav.jsp" %>
	
	<div>
	<table>
		<thead>
			<tr>
				<th>고양이 이름</th>
				<th>사진</th>
				<th>등록시간</th>
			</tr>
		</thead>
		<tbody>
		<%
		if(I_list != null){
			for(ImagesVo Image : I_list){
		%>
			<tr>
				<td><%=Image.getCAT_NAME() %></td>
				<td>
					<img alt="<%=Image.getCAT_NAME() %>" 
						 src="../public/<%=Image.getIMAGE_NAME() %>"
						width="200" height="200">
				</td>
				<td><%=Image.getREG_TIME() %></td>
			</tr>
		<%
			}
		}%>
		</tbody>
	</table>
	</div>
	
</body>
</html>