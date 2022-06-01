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

@WebServlet("/member/update.do")
public class MemberUpdate extends HttpServlet {
	MemberDao dao = new MemberDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String num = req.getParameter("NUMBER");
		
		
		MemberVo detail = null;
		try {
			detail = dao.detail(Integer.parseInt(num));
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.setAttribute("detail", detail);
		req.getRequestDispatcher("./update.jsp").forward(req, resp) ;
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		MemberVo mem = new MemberVo();
		boolean update = true;
		
		mem.setNUMBER(Integer.parseInt(req.getParameter("NUMBER")));
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
		
		try {
			update = dao.update(mem);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(update) {
			resp.sendRedirect("./list.do");
		}
		else {
			resp.sendRedirect("./update.do");
		}
		
	}

}
