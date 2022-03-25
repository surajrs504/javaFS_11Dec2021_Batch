package flyawayServlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SearchService ss= new SearchService();
		searchBean sb=new searchBean();
		try {	
		String date=request.getParameter("date");
		String source=request.getParameter("source");
		String destination=request.getParameter("destination");
		int seats = Integer.parseInt(request.getParameter("seats"));
		String s=String.valueOf(seats);
			sb.setSource(source);
			sb.setDestination(destination);
			sb.setSeats(seats);
			List<searchBean> SList=ss.searchdetails(sb);
			HttpSession session=request.getSession();
			session.setAttribute("seats", seats);
					request.setAttribute("date", date);
					request.setAttribute("listFA", SList);
					RequestDispatcher rd= request.getRequestDispatcher("/flightsAvailable.jsp");
					rd.forward(request, response);
		
	}
		catch(Exception ex) {
			
		HttpSession session=request.getSession();
					String nullseat="null";
					request.setAttribute("nullseat", nullseat);
					RequestDispatcher rd= request.getRequestDispatcher("/flightsAvailable.jsp");
					rd.forward(request, response);
					ex.printStackTrace();
		}
	}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
