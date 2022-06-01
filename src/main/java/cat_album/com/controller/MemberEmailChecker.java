package cat_album.com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cat_album.com.dao.MemberDao;

@WebServlet("/member/emailChecker.do")
public class MemberEmailChecker extends HttpServlet {
	MemberDao dao = new MemberDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("EMAIL");
		System.out.println(email);
		resp.setContentType("json/application; charset=UTF-8");
		
		try {
			if(dao.email_checker(email)) {
				resp.getWriter().append("{\"email_check\" : true }");
			}
			else {
				resp.getWriter().append("{\"email_check\" : false }");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
