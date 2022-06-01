package cat_album.com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/member/*")
public class MemberLoginCheck implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("filter normality activitive");
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		HttpSession session =  req.getSession();
		
		String Servletpath = (String)req.getServletPath();
		int grade = 3;
		if(session.getAttribute("GRADE") != null) {
			grade = (int)session.getAttribute("GRADE");			
		}
		
		boolean pass = true;
		
		
		if(Servletpath.equals("/member/list.do")
			&& grade > 1) {
			pass = false;
		}
		
		if(pass) {
			chain.doFilter(req, res);			
		}
		else {
			res.sendRedirect("../");
		}
		
		
	}

}
