package com.kh.app.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;





@WebServlet("/board/buy")
public class ProductBuyController extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/product.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		HttpSession s = req.getSession();
		
		if(s.getAttribute("loginUser") == null) {
			s.setAttribute("alertMsg", "로그인이 필요합니다.");
			resp.sendRedirect("/member/login");
			return;
		}
		
		//보여주긴하는데 세션에 값을 넣어서 보여줄꺼
		String productNo = req.getParameter("product_no");
		String delivery = req.getParameter("delivery");  
		String size = req.getParameter("size");        
		String quantity = req.getParameter("quantity");  
		
		s.setAttribute("delivery", delivery);
		s.setAttribute("quantity", quantity);
		
		System.out.println(productNo);
		System.out.println(size);
		ProductDao productDao = new ProductDao();
		
		ProductVo productVo = null;
		try {
			productVo = productDao.check(productNo, size);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(productVo == null) {
			s.setAttribute("alertMsg", "재고가 부족합니다");
			resp.sendRedirect("/board/buy");
			return;
		}
		
		s.setAttribute("productVo", productVo);
		resp.sendRedirect("/board/buy2");
	}
	
}
