package com.kh.app.product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/board/buy2")
public class ProductBuy2Controller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/buy.jsp").forward(req, resp);
	}
	
	
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	HttpSession s = req.getSession();

        
        Object loginUser = s.getAttribute("loginUser");
        if (loginUser == null) {
            s.setAttribute("alertMsg", "로그인이 필요합니다.");
            resp.sendRedirect("/member/login");
            return;
        }

        
        ProductVo productVo = (ProductVo) s.getAttribute("productVo");
        String deliveryType = (String) s.getAttribute("delivery");
        String quantityStr = (String) s.getAttribute("quantity");

        
        String address = req.getParameter("address");
        String phone = req.getParameter("phone");
        String payment = req.getParameter("payment");

        
        String userId = (String)s.getAttribute("loginUser"); 

        
        OrderVo orderVo = new OrderVo();
        
        orderVo.setOrder_Id(productVo.getProduct_No());           
        orderVo.setOrder_User(userId);                            
        orderVo.setOrder_Cnt(quantityStr);                        
        orderVo.setDelivery_Address(address);                     
        orderVo.setDelivery_Type(deliveryType);
        orderVo.setOrder_Size(productVo.getProduct_Size());                   

        
        ProductDao dao = new ProductDao();
        int result = 0;
        int result2 = 0;
		try {
			result = dao.insertOrder(orderVo);
			result2 = dao.updateProduct(orderVo);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

        if (result == 1 && result2 == 1) {
            s.setAttribute("alertMsg", "주문이 완료되었습니다.");
            resp.sendRedirect("/home");  
        } else {
            s.setAttribute("alertMsg", "주문 처리 실패. 다시 시도해주세요.");
            resp.sendRedirect("/board/buy");
        }
    }
}