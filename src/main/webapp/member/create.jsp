<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 생성 페이지입니다.</title>
<script src="create.js"></script>
</head>
<style>
	h1 {
		position : absolute;
		left : 50%;
		transform : translate(-50%, 0%);
	}
	#sign_up_form {
		border: 1px solid black;
		width : 500px;
		position: absolute;
		top : 50%;
		left : 50%;
		transform : translate(-50%, -50%);
		padding : 10px;
	}
</style>
<body>
	<h1>회원 생성 페이지 입니다.</h1>
	<form action="./create.do" method="post" name="MemCreate" id="sign_up_form">
		<p>
			<label> NAME : <input type="text" name="NAME" value="박하나"></label>
		</p>
		<p>
			<label> EMAIL : <input type="text" name="EMAIL" value="one">
				<select  id="EMAIL_DOMAIN">
					<option value="@gmail.com">@gmail.com</option>
					<option value="@naver.com">@naver.com</option>
					<option value="@daum.com">@daum.com</option>
					<option value="">직접 입력<option>
				</select>  
			</label>
			<span id="email_check">유효 이메일 확인칸</span>
		</p>
		<p>
			<label> ID : <input type="text" name="ID" value="fffff"></label>
			<span id="id_check">유효 ID 확인칸</span>
		</p>
		<p>
			<label> PASSWORD : <input type="text" name="PASSWORD" value="12345"></label>
		</p>
		<p>
			 GENDER : 
			 <label>male : <input type="radio" name="GENDER" value="male"></label>
			<label>female : <input type="radio" name="GENDER" value="female"></label>
			
			
		</p>
		<p>
			<label> BIRTH : <input type="text" name="BIRTH" value="1999-10-10"></label>
		</p>
		<p>
			<label> ADDRESS : <input type="text" name="ADDRESS" value="미래구 현재동 과거아파트"></label>
		</p>
		<p>
			<label> STATE : <input type="text" name="STATE" value="active"></label>
		</p>
		<button type="reset">Reset</button>
		<button type="submit">Submit</button>
	</form>
	
	
	
	<script>
		
	</script>
</body>
</html>