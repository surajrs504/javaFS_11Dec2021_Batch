package flyawayServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class orderconfirmservlet
 */
@WebServlet("/orderconfirmservlet")
public class orderconfirmservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessionn=request.getSession(); 
		int seats=(int)sessionn.getAttribute("seats");
		String f=String.valueOf(sessionn.getAttribute("flightNo"));
		
		sessionn.setAttribute("noseats", seats);
		sessionn.setAttribute("fnum", f);
		RequestDispatcher rd= request.getRequestDispatcher("orderconfirm.jsp");
		rd.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
