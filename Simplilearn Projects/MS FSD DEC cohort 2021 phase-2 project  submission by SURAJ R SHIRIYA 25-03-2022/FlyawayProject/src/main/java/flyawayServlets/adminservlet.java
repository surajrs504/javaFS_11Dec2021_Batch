package flyawayServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import flyawayService.adminLogin;
import flyawaybean.adminbean;
import flyawaybean.loginBean;

/**
 * Servlet implementation class adminservlet
 */
@WebServlet("/adminservlet")
public class adminservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessionup= request.getSession();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		try{
			loginBean lb=new loginBean();
		lb.setusername(username);
		lb.setpassword(password);
		adminLogin al=new adminLogin();
		boolean b=al.loginservice(lb);
		
		if(b) {
			RequestDispatcher rd= request.getRequestDispatcher("/adminpage.html");
			rd.forward(request, response);
		}
		else
		{	String errP="errPassword";
		sessionup.setAttribute("errP", errP);
			RequestDispatcher rd= request.getRequestDispatcher("/invalidpage.jsp");
			rd.forward(request, response);
		}
		}
		catch(Exception ex) {
			String err="usernameOrPassword";
			sessionup.setAttribute("err", err);
			RequestDispatcher rd= request.getRequestDispatcher("/invalidpage.jsp");
			rd.forward(request, response);
		}
	}
		//doGet(request, response);
}


