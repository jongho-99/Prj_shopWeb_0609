<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jshop-login</title>
    <link rel="stylesheet" href="/static/css/login.css">
</head>
    
<body>

	<%@ include file="/WEB-INF/views/common/header.jsp" %>
	
    <%@ include file="/WEB-INF/views/common/fixed.jsp" %>
	
	
	<br><br>
	<div class="login-box">
		<div>로그인</div>
		<form action="/member/login" method="post">
			  <input type="text" name="userId" placeholder="아이디 또는 전화번호">
			  <input type="password" name="userPwd" placeholder="비밀번호">
			
			  <div class="checkbox-row">
				    <input type="checkbox" id="keep-login">
				    <label for="keep-login">로그인 상태 유지</label>
			  </div>
			
			  <button class="login-button">로그인</button>
			
			  <div class="links">
				    <a href="/member/searchPwd">비밀번호 찾기</a>
				    <a href="/member/searchId">아이디 찾기</a>
				    <a href="/member/join">회원가입</a>
			  </div>
		</form>
	</div>

</body>
</html>