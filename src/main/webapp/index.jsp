<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CAT_ALBUM 인덱스 입니다. </title>
</head>
<style>
	
	h1 {
		border-bottom : 0px;
		padding-top: 10px;
		padding-bottom: 10px;
		padding-left: 43%;
	}
		
	.image_1 {	grid-area : i1;	}
	.image_2 {	grid-area : i2 ; }
	.image_3 {  gird-area : i3 ; }
	
	.contents_box {
		display: grid;
		grid-template-areas :
			'i1 i2'
			'i1 i3';
		gap : 10px;
		padding : 5px;
		background-color: aqua;
	}
	
	.contents_box > div {
		background-color: silver;
		text-align: center;
	}


</style>
<body>
	<h1>고양이 앨범</h1>
	
	<%@ include file="/Header_nav.jsp" %>
	<div class="contents_box">
		<div class="image_1">오늘의 인기 넘버원</div>
		<div class="image_2">오늘의 인기 넘버투</div>
		<div class="image_3">오늘의 인기 넘버쓰리</div>
	</div>

</body>
</html>