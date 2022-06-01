package cat_album.com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cat_album.com.dao.MemberDao;

@WebServlet("/member/checker.do")
public class MemberChecker extends HttpServlet {
	private MemberDao dao = new MemberDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("./login.jsp").forward(req, resp) ;
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String ID = req.getParameter("ID");
		boolean checker = false;
		int grade = 0;
		
		HttpSession session = req.getSession();
		
		
		
		try {
			checker = dao.mem_checker(req.getParameter("ID"), req.getParameter("PASSWORD"));
			if(checker) {				
				grade = Integer.parseInt(dao.detail(req.getParameter("ID")).getGRADE());
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(checker) {
			session.setAttribute("ID", ID);
			session.setAttribute("GRADE", grade);
			resp.sendRedirect("/cat_album");
		}
		else {
			resp.sendRedirect("./checker.do?login_fail");
		}
		
		
	}
}
