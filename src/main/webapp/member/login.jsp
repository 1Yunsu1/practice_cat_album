<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지 입니다.</title>
</head>
<style>
	#login_box {
		position :absolute;
		left: 50%;
		top: 50%;
		transform: translate(-50%, -50%);
	}
	#login_form {
		border : 1px solid black;
		border-radius : 30px;
		background-color: silver;
		width : 300px;
		margin : 10px 10px 10px 10px;
		padding :  20px 20px 20px 20px;
		float: left;
	}
	#l_id {
		white-space: pre;
	}
	#l_pw {
		white-space: pre;
	}
	.l_span {
		display : box;
		padding : 5px;
		margin : 5px;
	}
	#login_form>button {
		float: right;
	}
</style>
<body>
	<h1>로그인</h1>
	<%@ include file="/Header_nav.jsp" %>
	<div id="login_box">
		<form action="./checker.do" method="post" id="login_form" name="Member_Checker">
			<div class = "l_span">
				<label> <span id="l_id" >ID   :    </span><input type="text" name="ID"></label>		
			</div>
			<div class = "l_span">
				<label> <span  id="l_pw" >PW :    </span><input type="password" name="PASSWORD"></label>
			</div>
				<br>
				<button type="reset">reset</button>		
				<button type="submit">login</button>					
		</form>
	</div>
</body>
</html>