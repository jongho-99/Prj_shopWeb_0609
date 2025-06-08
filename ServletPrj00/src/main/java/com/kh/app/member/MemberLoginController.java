package com.kh.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/member/login")
public class MemberLoginController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		HttpSession s = req.getSession();
		try {
			String userId = req.getParameter("userId");
			String userPwd = req.getParameter("userPwd");
			
			MemberService memberService = new MemberService();
			
			MemberVo memberVo = memberService.login(userId, userPwd);
			
			if(memberVo == null) {
				
				req.setAttribute("alertMsg", "로그인 실패입니다.");
				req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
				return;
				
			} 
				
			
			s.setAttribute("alertMsg", memberVo.getUser_Nick() + "님 반갑습니다.");
			s.setAttribute("loginUser", memberVo.getUser_Nick());
			resp.sendRedirect("/home");		
			
		} catch(Exception e) {
			s.setAttribute("alertMsg", "[로그인 실패] 아이디 비밀번호를 확인해주세요");
			resp.sendRedirect("/member/login");	
			e.printStackTrace();
			return;
		}
		
		
		
		
	}
}
