package cat_album.com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cat_album.com.dao.MemberDao;
import cat_album.com.vo.MemberVo;

@WebServlet("/member/create.do")
public class MemberCreate extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("./create.jsp").forward(req, resp);
	}
	
	// NUMBER NAME EMAIL ID PASSWORD GENDER	BIRTH ADDRESS STATE
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		MemberVo mem = new MemberVo();
		mem.setNAME(req.getParameter("NAME"));
		mem.setEMAIL(req.getParameter("EMAIL"));
		mem.setID(req.getParameter("ID"));
		mem.setPASSWORD(req.getParameter("PASSWORD"));
		mem.setGENDER(req.getParameter("GENDER"));
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-DD");
		try {
			mem.setBIRTH( formatter.parse(req.getParameter("BIRTH"))  );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mem.setADDRESS(req.getParameter("ADDRESS"));
		mem.setSTATE(req.getParameter("STATE"));
		
		MemberDao dao = new MemberDao();
		boolean create=false;
		
		try {
			create = dao.create(mem);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.getSession().setAttribute("create", create);
		
		if(create) {
			resp.sendRedirect("./list.do");
		}
		else {
			resp.sendRedirect("./create.do");
		}
		
	}
	
}
