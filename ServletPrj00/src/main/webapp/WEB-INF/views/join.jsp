<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jshop-join</title>
    <link rel="stylesheet" href="/static/css/login.css">
</head>
    
<body>

	<%@ include file="/WEB-INF/views/common/header.jsp" %>
	
    <%@ include file="/WEB-INF/views/common/fixed.jsp" %>
	
	
	<br><br>
	<div class="login-box">
		<div>회원가입</div>
		<form action="/member/join" method="post">
			  <input type="text" name="userId" placeholder="아이디 또는 전화번호를 입력해주세요">
			  <input type="password" name="userPwd" placeholder="비밀번호를 입력해주세요">
			  <input type="text" name="userNick" placeholder="닉네임을 입력해주세요">
				
			<br>
			
			  <button class="login-button">회원가입</button>
			
			  <div class="links">
				    <a href="/board/infoUse">이용약관</a>
				    <a href="/board/infoGet">개인정보 수집 및 이용</a>
				    <a href="/board/posi">위치기반서비스 이용</a>
			  </div>
		</form>
	</div>

</body>
</html>