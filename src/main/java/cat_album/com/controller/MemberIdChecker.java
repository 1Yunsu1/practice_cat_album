package cat_album.com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cat_album.com.dao.MemberDao;

@WebServlet("/member/idChecker.do")
public class MemberIdChecker extends HttpServlet {
	MemberDao dao = new MemberDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("ID");
		resp.setContentType("json/application; charset=UTF-8");
		
		try {
			if(dao.id_checker(id)) {
				resp.getWriter().append("{\"id_check\" : true }");
			}
			else {
				resp.getWriter().append("{\"id_check\" : false }");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
