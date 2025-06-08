<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/static/css/buy.css">
<!-- </head> -->
<body>
  <div class="order-container">
  	
  	<%@ include file="/WEB-INF/views/common/header.jsp" %>
	
    <%@ include file="/WEB-INF/views/common/fixed.jsp" %>
  
  
    <h2>주문/결제 <span class="breadcrumb">주문완료 ></span></h2>
	
	<br>
    <div class="order-main">
      
      
      <form action="/board/buy2" method="post">
      <div class="order-left">
        <section class="order-section">
          <div class="section-header">
            <strong>배송지</strong> <button class="change-btn">배송지 변경</button>
          </div>
          <div class="address-info">
            <span class="badge">기본배송지</span>
            <input type="text" name="address" placeholder = "주소를 입력해주세요">
            <input type="text" name="phone" placeholder = "휴대폰번호를 입력해주세요">
          </div>
        </section>

        <section class="order-section">
          <div class="section-header">
            <strong>배송 요청사항</strong> <button class="change-btn">변경</button>
          </div>
          <div class="delivery-msg">문 앞 (#0********)</div>
        </section>

        <section class="order-section">
          <strong>결제수단</strong>
          <div class="payment-options">
            <label><input type="radio" name="payment" /> 쿠페이 머니: 0원 <span class="tag">최대 캐시적립</span></label><br>
            <label><input type="radio" name="payment" checked /> 
              <select>
                <option>국민은행 / ********3961</option>
              </select>
              <label><input type="checkbox" checked /> 기본 결제 수단으로 사용</label>
            </label>
          </div>
          <div class="other-methods">
            <a href="#">다른 결제 수단 ▾</a>
          </div>
        </section>

        <section class="order-section">
          <strong>현금영수증</strong>
          <div class="receipt">
            현금영수증 미신청 <button class="change-btn">입력</button>
          </div>
        </section>

        <div class="order-note">배송 1건 중 1</div>
      </div>

      
     
      <div class="order-right">
        <h3>최종 결제 금액</h3>
        <div class="summary">
          <p>총 상품 가격 <span>${productVo.product_Price * quantity} 원</span></p>
          <p>배송비 <span>0원</span></p>
          <p>JSHOP캐시 <span>0원</span></p>
          <hr />
          <p class="total">총 결제 금액 <strong>${productVo.product_Price * quantity} 원</strong></p>
        </div>

        <div class="agreement">
          <input type="checkbox" checked /> 개인정보 제3자 제공 동의<br />
          <small>* 주문 내용을 확인하였으며... 동의합니다.</small>
        </div>

        <button class="pay-btn">결제하기</button>
      </div>
     </form>
    </div>
  </div>
</body>
</html>