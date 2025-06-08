package com.kh.app.member;

import java.sql.Connection;

import com.kh.app.db.JDBCTemplate;

public class MemberService {
	
	private MemberDao memberDao = new MemberDao();

	//회원가입
		public int join(MemberVo joinVo) throws Exception {
			int result = 0;
			Connection conn = null;
			try {
				//비지니스 로직
				
				//연결
				conn = JDBCTemplate.getConn();
				//DAO 생성
				
				result = memberDao.join(conn, joinVo);
				
				//트랜잭션
				if(result == 1) {
					conn.commit();
				} else {
					conn.rollback();
				}
				
			} finally {
				//반납
				conn.close();
			}
			return result;
		}
	
	
	
	
	
	//로그인
	public MemberVo login(String userId, String userPwd) throws Exception {
		MemberVo memberVo = null;
		Connection conn = null;
		
		try {
			//비지니스 로직
			
			//연결
			conn = JDBCTemplate.getConn();
			//DAO 생성
			
			memberVo = memberDao.login(conn, userId, userPwd);
			
			//트랜잭션
			if(memberVo != null) {
				conn.commit();
			} else {
				conn.rollback();
			}
			
		} finally {
			//반납
			conn.close();
		}
		
		return memberVo;
	}


}
