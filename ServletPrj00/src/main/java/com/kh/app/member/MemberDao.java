package com.kh.app.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDao {
	
	public MemberVo login(Connection conn, String userId, String userPwd) throws Exception {
		MemberVo memberVo = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM MEMBER WHERE USER_ID = ? AND USER_PWD = ? AND DEL_YN = 'N'";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,userId);
			pstmt.setString(2,userPwd);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			memberVo = new MemberVo(
					rs.getString("NO"),
					rs.getString("USER_ID"),
					rs.getString("USER_PWD"),
					rs.getString("USER_NICK"),
					rs.getString("CREATED_DATE"),
					rs.getString("DEL_YN"));
			
		}  finally {
			//자원반납
			rs.close();
			pstmt.close();			
		}
		
		return memberVo;
	}

	public int join(Connection conn, MemberVo joinVo) throws Exception {
		
		PreparedStatement pstmt = null;
		int result = 0; 
		try {
			
			String sql = "INSERT INTO MEMBER(NO, USER_ID, USER_PWD, USER_NICK) VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, joinVo.getUser_Id());
			pstmt.setString(2, joinVo.getUser_Pwd());
			pstmt.setString(3, joinVo.getUser_Nick());
			
			result = pstmt.executeUpdate();
					
		} finally {
			
			//자원반납
			pstmt.close();
			
		}
		
		return result;
	}

}
