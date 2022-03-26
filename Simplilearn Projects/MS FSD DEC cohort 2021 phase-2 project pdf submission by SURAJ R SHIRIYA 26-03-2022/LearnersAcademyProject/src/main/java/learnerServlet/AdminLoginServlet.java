package learnerServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learnerBean.LoginBean;
import learnerService.AdminLoginService;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		AdminLoginService as= new AdminLoginService();
		LoginBean b= new LoginBean();
		b.setUsername(username);
		b.setPassword(password);
		boolean value=as.validation(b);
		int k=0;
		if(value) {k=1;
			 response.sendRedirect("adminpage.html");  
		}
		else
		{
			 response.sendRedirect("invalidAdminDetails.html");  
		}
		}
		catch(Exception ex) {
			response.sendRedirect("invalidAdminDetails.html");
			
		}
		doGet(request, response);
	}

}
