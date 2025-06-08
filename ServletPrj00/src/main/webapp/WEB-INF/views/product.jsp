<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jshop-product</title>
    <link rel="stylesheet" href="/static/css/product.css">
</head>
    
<body>
	
	<%@ include file="/WEB-INF/views/common/header.jsp" %>
	
    <%@ include file="/WEB-INF/views/common/fixed.jsp" %>


  <div class="container">
    
    
    <div class="left-section">
      <img class="main-image" src="/static/image/main1.jpg" alt="상품 메인 이미지">
      <div class="thumbnails">
        <img src="/static/image/main1.jpg" alt="썸네일1" class="thumb">
        <img src="/static/image/main1_1.jpg" alt="썸네일2" class="thumb">
        <img src="/static/image/main1_2.jpg" alt="썸네일3" class="thumb">
        <img src="/static/image/main1_3.jpg" alt="썸네일4" class="thumb">
      </div>
    </div>
    
    <script>
	  
	  const thumbnails = document.querySelectorAll('.thumb');
	  const mainImage = document.querySelector('.main-image');
	
	  thumbnails.forEach(thumb => {
	    thumb.addEventListener('click', () => {
	      
	      mainImage.src = thumb.src;
	    });
	  });
	</script>

    
    <div class="right-section">
      <div class="product-title">
        #WAYNE 159 플레어 데님팬츠 
        <span class="tag">오늘출발</span>
      </div>

      <div class="checkpoints">
        <strong>[CHECK POINT]</strong>
        <ol>
          <li>트렌디한 플레어 데님</li>
          <li>구조적 디자인으로 셰이프에이드 핏 감</li>
          <li>다리가 길어보이는 효과</li>
          <li>탄탄한 데님 원사 사용</li>
        </ol>
      </div>

      <div class="info-list">
        <p>COLOR - 1 COLOR</p>
        <p>SIZE - S,M,L</p>
        <p>MODEL 178/68 S SIZE 착용</p>
        <p>FABRIC - 코튼 100%</p>
      </div>

      <div class="price-area">
        <p>소비자가 : <del>₩62,000</del></p>
        <p>판매가 : <strong>₩49,600</strong></p>
      </div>
		
	<form action="/board/buy" method="post">
		<input type="hidden" name ="product_no" value="1">
      <div class="options">
        <p>SIZE: (3) SIZE 28~33</p>
	
        <p>DELIVERY:</p>
        <div class="radio-group">
        <div>       
          <input id="inin" type="radio" name="delivery" value="domestic" checked> 
          <label for="inin">국내배송</label>
          </div>
          <div>
          <input id = "outout" type="radio" name="delivery" value="international"> 
          <label for="outout">해외배송</label>   
          </div>
        </div>

        <p>색상/사이즈:</p>
        <select name="size" required>
          <option value="">- [필수] 옵션선택 -</option>
          <option value="S">S</option>
          <option value="M">M</option>
          <option value="L">L</option>
        </select>
        <select name="quantity" required>
          <option value="">- [필수] 수량선택 -</option>
          <option value="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
          <option value="4">4</option>
        </select>
      </div>


      <div class="buttons">
        <button class="kakao-pay">pay 결제가능</button>
        <input type="submit"  class="buy-now" value="바로 구매하기">
        <button class="cart">장바구니</button>
      </div>
     </form>
    </div>  
  </div>
  
</body>
</html>