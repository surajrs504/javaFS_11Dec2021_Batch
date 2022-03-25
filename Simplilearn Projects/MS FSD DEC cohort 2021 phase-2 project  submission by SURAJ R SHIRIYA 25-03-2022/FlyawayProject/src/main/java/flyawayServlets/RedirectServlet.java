package flyawayServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import flyawayService.SearchService;
import flyawaybean.searchBean;

/**
 * Servlet implementation class RedirectServlet
 */
@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String flightNo = request.getParameter("check");
		if(flightNo==null) {
			RequestDispatcher rd= request.getRequestDispatcher("flightNotSelected.html");
			rd.forward(request, response);
		} else {
		HttpSession session=request.getSession();
		session.setAttribute("flightNo", flightNo);
		SearchService ss= new SearchService();
		searchBean sb=new searchBean();
		sb.setFno(flightNo);
		RequestDispatcher rd= request.getRequestDispatcher("userDetails.html");
		rd.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
