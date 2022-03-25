package flyawayServlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import flyawayService.adminopservice;
import flyawaybean.adminbean;

/**
 * Servlet implementation class adminOpServlet
 */
@WebServlet("/adminOpServlet")
public class adminOpServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String option=request.getParameter("option");
		
		adminopservice ads=new adminopservice();
		if(option.equals("listSD")) {
			try {
			List<adminbean> list= ads.listSD();
			if(list==null) {
			RequestDispatcher rd= request.getRequestDispatcher("/invalidpage.html");
			rd.forward(request, response);}
			else {
				request.setAttribute("listSD", list);
				RequestDispatcher rd= request.getRequestDispatcher("/listsourceDestination.jsp");
				rd.forward(request, response);
			}
			}
			catch(Exception ex){
				
			}
			
		}
		
		
		
		
		else if(option.equals("listAirlines")) {
			List<adminbean> list= ads.listAirlines();
			if(list.isEmpty()) {
			RequestDispatcher rd= request.getRequestDispatcher("/invalidpage.html");
			rd.forward(request, response);}
			else {
				request.setAttribute("listAirlines", list);
				RequestDispatcher rd= request.getRequestDispatcher("/listAirlines.jsp");
				rd.forward(request, response);
			}
		}
		
		
		
		else if(option.equals("details")) {
			List<adminbean> list= ads.airlineSchedule();
			if(list==null) {
				System.out.println("null list");
			RequestDispatcher rd= request.getRequestDispatcher("/invalidpage.html");
			rd.forward(request, response);}
			else {
				request.setAttribute("listSchedule", list);
				RequestDispatcher rd= request.getRequestDispatcher("/listDetails.jsp");
				rd.forward(request, response);
			}
		}else {
			
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String password=request.getParameter("password");
		if(password=="") {
			String invalidpass="invalidpass";
			session.setAttribute("invalidpass", invalidpass);
			RequestDispatcher rd= request.getRequestDispatcher("/invalidpage.jsp");
			rd.forward(request, response);
		}else {
		
		adminopservice aod = new adminopservice();

		boolean c=aod.changepass(password);
		
		if(c) {
			RequestDispatcher rd= request.getRequestDispatcher("/pwdchanged.html");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd= request.getRequestDispatcher("/pwdunchanged.html");
			rd.forward(request, response);
		}
		}
		doGet(request, response);
	}

}
