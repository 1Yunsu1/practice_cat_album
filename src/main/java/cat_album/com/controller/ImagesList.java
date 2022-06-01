package cat_album.com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cat_album.com.dao.ImagesDao;
import cat_album.com.vo.ImagesVo;

@WebServlet("/album/list.do")
public class ImagesList extends HttpServlet {
	
	private ImagesDao dao = new ImagesDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String ID = req.getParameter("ID");
		HttpSession session = (HttpSession)req.getSession();
		String ID = (String)session.getAttribute("ID");
		
		if( ID == null ) {
			resp.sendRedirect("../");
		}
		else {
			
			System.out.println("ImageList : "+ID);
			List<ImagesVo> I_list = null; 
			try {
				I_list = dao.ImageList(ID);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			if(!I_list.isEmpty()) {
				System.out.println(I_list.get(0).getCAT_NAME());				
			}
			req.setAttribute("I_list", I_list);
			req.getRequestDispatcher("./images.jsp").forward(req, resp);
			
		}
		
	}
}
