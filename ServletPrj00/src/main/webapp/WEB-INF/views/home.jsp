<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jshop</title>
    <link rel="stylesheet" href="/static/css/1주차과제.css">
</head>


<body>
	
	<%@ include file="/WEB-INF/views/common/header.jsp" %>
	
    <%@ include file="/WEB-INF/views/common/fixed.jsp" %>
 
    <div id="div01">
        <span class="icon left">&lt;</span>
        <img src="/static/image/banner1.jpeg" alt="banner1">
        <span class="icon right">&gt;</span>
    </div>
    
    <br>
    <br>
    <div id="main">
        <div id="mt">
            <h2>NEW 10% SALE !!</h2>
            <p>새롭게 업데이트된 상품 입니다 :)</p>
        </div>
        <div class="mainitem">
            <ul>
                <li>
                    <div>
                        <a href="/board/prd01"><img src="/static/image/main1.jpg" alt="main1"></a>
                    </div>
                    <div class="itemtext">
                        <a href="/board/prd01">#WAYNE 159 플레어 데님팬츠</a>
                        <p>(3) SIZE 28-33</p>
                        <s>62,000원 \49,600원</s>
                        <span>\44,700원</span>
                         
                        <img src="/static/image/new10.png" alt="">
                    </div>
                </li>
                <li>
                    <div>
                        <a href=""><img src="/static/image/main2.jpg" alt="main1"></a>
                    </div>
                    <div class="itemtext">
                        <a href="">#포시즌 단가라 긴팔</a>
                        <p>FREE SIZE 95-100</p>
                        <s>\28,500원 \22,800원</s>
                        <span>\20,600원</span>
                         
                        <img src="/static/image/new10.png" alt="">
                    </div>
                </li>
                <li>
                    <div>
                        <a href=""><img src="/static/image/main3.jpg" alt="main1"></a>
                    </div>
                    <div class="itemtext">
                        <a href="">브라이튼 링거 반팔티</a>
                        <p>FREE SIZE 95-100</p>
                        <s>\29,900원 \23,900원</s>
                        <span>\21,600원</span>
                        <img src="/static/image/new10.png" alt="">
                    </div>
                </li>
            </ul>
        </div>

        
        <div class="mainitem" id="main02">
            <ul>
                <li>
                    <div>
                        <a href=""><img src="/static/image/main4.gif" alt="main1"></a>
                    </div>
                    <div class="itemtext">
                        <a href="">필데본느 핸드 워셔블 버튼 카라 반팔티</a>
                        <p>SIZE 95-105</p>
                        <s>\35,900원</s>
                        <span>\32,400원</span>
                         
                        <img src="/static/image/new10.png" alt="">
                    </div>
                </li>
                <li>
                    <div>
                        <a href=""><img src="/static/image/main5.webp" alt="main1"></a>
                    </div>
                    <div class="itemtext">
                        <a href="">디엠 와이드 밴딩 슬랙스</a>
                        <p>SIZE 29-38</p>
                        <s>\37,800원</s>
                        <span>\22,900원</span>
                         
                    </div>
                </li>
                <li>
                    <div>
                        <a href=""><img src="/static/image/main6.gif" alt="main1"></a>
                    </div>
                    <div class="itemtext">
                        <a href="">고밀도 워싱 오버 박스 반팔티</a>
                        <p>FREE SIZE 100-105</p>
                        <s>\25,900원</s>
                        <span>\23,400원</span>
                         
                        <img src="/static/image/new10.png" alt="">
                    </div>
                </li>
            </ul>
        </div>

        
        <div class="mainitem" id="main03">
            <ul>
                <li>
                    <div>
                        <a href=""><img src="/static/image/main7.gif" alt="main1"></a>
                    </div>
                    <div class="itemtext">
                        <a href="">쿨필 피셔맨 라운드 부클 니트</a>
                        <p>FREE SIZE 95-100</p>
                        <s>\39,800원</s>
                        <span>\35,900원</span>
                        
                        <img src="/static/image/new10.png" alt="">
                    </div>
                </li>
                <li>
                    <div>
                        <a href=""><img src="/static/image/main8.gif" alt="main1"></a>
                    </div>
                    <div class="itemtext">
                        <a href="">아이스 린넨 포멀 헨리넥 반팔 니트</a>
                        <p>(2) SIZE 95-105</p>
                        <s>\35,900원</s>
                        <span>\32,400원</span>
                        
                        <img src="/static/image/new10.png" alt="">
                    </div>
                </li>
                <li>
                    <div>
                        <a href=""><img src="/static/image/main9.webp" alt="main1"></a>
                    </div>
                    <div class="itemtext">
                        <a href="">워셔블 케이블 오픈 카라 반팔</a>
                        <p>(2) SIZE 95-105</p>
                        <s>\39,800원</s>
                        <span>\35,900원</span>
                        
                        <img src="/static/image/new10.png" alt="">
                    </div>
                </li>
            </ul>
        </div>


        
        <div class="mainitem" id="main04">
            <ul>
                <li>
                    <div>
                        <a href=""><img src="/static/image/main10.webp" alt="main1"></a>
                    </div>
                    <div class="itemtext">
                        <a href="">#쿨링 카라 버튼 린넨 반팔</a>
                        <p>(2) SIZE 95-105</p>
                        <s>\29,800원</s>
                        <span>\26,900원</span>
                        
                        <img src="/static/image/new10.png" alt="">
                    </div>
                </li>
                <li>
                    <div>
                        <a href=""><img src="/static/image/main11.webp" alt="main1"></a>
                    </div>
                    <div class="itemtext">
                        <a href="">아이스실크 헨리 케이블 반팔 니트</a>
                        <p>(2) SIZE 95-105</p>
                        <s>\39,900원</s>
                        <span>\36,000원</span>
                        
                        <img src="/static/image/new10.png" alt="">
                    </div>
                </li>
                <li>
                    <div>
                        <a href=""><img src="/static/image/main12.webp" alt="main1"></a>
                    </div>
                    <div class="itemtext">
                        <a href="">콜드 린넨 케이블 집업 카라 반팔티</a>
                        <p>(2) SIZE 95-105</p>
                        <s>\43,000원</s>
                        <span>\38,700원</span>
                         
                        <img src="/static/image/new10.png" alt="">
                    </div>
                </li>
            </ul>
        </div>
    </div>
</body>
</html>