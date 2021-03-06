<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<body>
 <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/cat_album">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/cat_album/member/checker.do">로그인</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/cat_album/member/create.do">회원가입</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/cat_album/album/list.do">고양이 앨범</a>
        </li>
        
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            목록
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="/cat_album/member/list.do">멤버리스트</a></li>
            <li><a class="dropdown-item" href="/cat_album/member/create.do">회원가입</a></li>
            <li><a class="dropdown-item" href="/cat_album/member/checker.do">로그인</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Something else here</a></li>
          </ul>
        </li>
        
      </ul>
    	  	<% String ID = (String)session.getAttribute("ID");%>
    	  	<span>  ID : <%=ID  %></span>/
      <a href="/cat_album/member/logout.do">로그아웃</a>
    </div>
  </div>
</nav>



</body>
