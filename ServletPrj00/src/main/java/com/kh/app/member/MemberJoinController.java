package com.kh.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/member/join")
public class MemberJoinController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/join.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		try {
			String userId = req.getParameter("userId");
			String userPwd = req.getParameter("userPwd");
			String userNick = req.getParameter("userNick");
			
			MemberService memberService = new MemberService();
			
			MemberVo joinVo = new MemberVo();
			
			joinVo.setUser_Id(userId);
			joinVo.setUser_Pwd(userPwd);
			joinVo.setUser_Nick(userNick);
			
			int result  = memberService.join(joinVo);
			
			if(result != 1) {
				
				req.setAttribute("alertMsg", "회원가입 실패입니다.");
				req.getRequestDispatcher("/WEB-INF/views/join.jsp").forward(req, resp);
				return;
				
			} 
			
			HttpSession s = req.getSession();
			s.setAttribute("alertMsg", "회원가입 완료되었습니다");
			resp.sendRedirect("/member/login");
			
		} catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
	}
	

}
