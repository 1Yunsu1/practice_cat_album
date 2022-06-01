package cat_album.com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cat_album.com.dao.MemberDao;

@WebServlet("/member/delete.do")
public class MemberDelete extends HttpServlet {
	MemberDao dao = new MemberDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		boolean delete = true;
		
		try {
			delete = dao.delete(Integer.parseInt(req.getParameter("NUMBER")) );
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resp.sendRedirect("./list.do");
	}
}
