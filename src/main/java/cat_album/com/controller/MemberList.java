package cat_album.com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cat_album.com.dao.*;
import cat_album.com.vo.*;

@WebServlet("/member/list.do")
public class MemberList extends HttpServlet {
	private MemberDao dao = new MemberDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String page_str = req.getParameter("page");
		List<MemberVo> mem_list = null;
		
		try {
			mem_list = dao.list();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.setAttribute("mem_list", mem_list);
		req.getRequestDispatcher("./list.jsp").forward(req, resp);
		
	}
}
