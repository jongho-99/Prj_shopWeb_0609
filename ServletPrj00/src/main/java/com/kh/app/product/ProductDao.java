package com.kh.app.product;

import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kh.app.db.JDBCTemplate;

public class ProductDao {

	public ProductVo check(String productNo, String size) throws Exception {
	    Connection conn = JDBCTemplate.getConn();

	    String sql = "SELECT * FROM PRODUCT WHERE PRODUCT_NO = ? AND TRIM(PRODUCT_SIZE) = ?";
	    PreparedStatement pstmt = conn.prepareStatement(sql);
	    pstmt.setInt(1, Integer.parseInt(productNo));
	    pstmt.setString(2, size);
	    
	    System.out.println("실행할 SQL: " + sql);
	    System.out.println("SQL params: productNo=" + productNo + ", size=" + size);
	    
	    ResultSet rs = pstmt.executeQuery();
	    ProductVo productVo = null;
	    if (rs.next()) {  
	    	productVo = new ProductVo(
	            rs.getString("PRODUCT_ID"),
	            rs.getString("PRODUCT_NO"),
	            rs.getString("PRODUCT_CNT"),
	            rs.getString("PRODUCT_NAME"),
	            rs.getString("PRODUCT_PRICE"),
	            rs.getString("PRODUCT_SIZE")
	        );
	    } 
	  
	    return productVo;
	}

	public int insertOrder(OrderVo vo) throws Exception {
	    Connection conn = JDBCTemplate.getConn();
	    PreparedStatement pstmt = null;
	    int result = 0;

	    String sql = "INSERT INTO ORDER_HEADER (ORDER_NO, ORDER_ID, ORDER_USER, ORDER_CNT, ORDER_DATE, DELIVERY_ADDRESS, DELIVERY_TYPE) "
	               + "VALUES (SEQ_ORDER.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?)";

	    try {
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, vo.getOrder_Id());
	        pstmt.setString(2, vo.getOrder_User());
	        pstmt.setString(3, vo.getOrder_Cnt());
	        pstmt.setString(4, vo.getDelivery_Address());
	        pstmt.setString(5, vo.getDelivery_Type());

	        result = pstmt.executeUpdate();

	        if (result == 1) {
	            conn.commit();
	        } else {
	        	conn.rollback();
	        }
	    } finally {
	    	conn.close();
	    	conn.close();
	    }

	    return result;
	}
	
	
}
