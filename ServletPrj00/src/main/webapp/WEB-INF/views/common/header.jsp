<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<link rel="stylesheet" href="/static/css/1주차과제.css">

	<c:if test="${not empty alertMsg}">
	    <script>
	        alert("${alertMsg}");
	    </script>
	    <c:remove var="alertMsg"/>
	</c:if>


<header>
		<div id="mainmenu">
		    <a id="hd" href="/home">
		    	<h1 style="font-size: 50px;">Jshop</h1>
		    </a>
		    <nav>
		        <ul>
		            <li></li>
		            <li><input type="search" placeholder="검색어를 입력해주세요."></li>
		            <li><a href="/shop/cart">장바구니</a></li>
		            <li><a href="/shop/ordercheck">주문조회</a></li>
		        </ul>
		    </nav>
	    </div>
	    <div id="submenu">
	        <ul>
	            <li><a href="">오늘출발</a></li>
	            <li><a href="">1-3만원대</a></li>
	            <li><a href="" style="color: orange;">BEST</a></li>
	            <li><a href="">NEW-10%</a></li>
	            <li><a href="" style="color: violet;">프리미엄</a></li>
	            <li><a href="" style="color:red">SALE-60%</a></li>
	            <li><a href="">세트구매</a></li>
	            <li><a href="">OUTER</a></li>
	            <li><a href="">TOP</a></li>
	            <li><a href="">SHIRTS</a></li>
	            <li><a href="">PANTS</a></li>
	            <li><a href="">SHOES</a></li>
	            <li><a href="">ACC</a></li>
	        </ul>
	    </div>
	    <div id="submenu2">
	        <ul>
	        	<c:if test="${empty loginUser}">
	            <li><a href="/member/login">로그인</a></li>
	            <li><a href="/member/join">회원가입</a></li>
	            </c:if>
	            
	            <c:if test="${not empty loginUser}">
	            <li>${loginUser} 고객님 반갑습니다. </li>
	            <li><a href="/member/logout">로그아웃</a></li>
	            <li><a href="/member/mypage">마이페이지</a></li>
	            <li><a href="/member/com">Community</a></li>
	            </c:if>
 
	        </ul>
	    </div>
	</header>