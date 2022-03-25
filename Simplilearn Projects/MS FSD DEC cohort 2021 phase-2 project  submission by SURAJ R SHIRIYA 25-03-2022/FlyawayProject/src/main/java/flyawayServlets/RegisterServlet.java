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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Email = request.getParameter("email");
		String fname= request.getParameter("fname");
		String  lname= request.getParameter("lname");
		String  age= request.getParameter("age");
		String mno= request.getParameter("mobile");
		String gender = request.getParameter("gender");
		String  password= request.getParameter("password");
		String country = request.getParameter("country");
		HttpSession ss= request.getSession();
		ss.setAttribute("fname", fname);
		ss.setAttribute("lname", lname);
		ss.setAttribute("age", age);
		ss.setAttribute("mno", mno);
		ss.setAttribute("gender", gender);
		ss.setAttribute("country", country);
		RequestDispatcher rd= request.getRequestDispatcher("BookedFlight.jsp");
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
