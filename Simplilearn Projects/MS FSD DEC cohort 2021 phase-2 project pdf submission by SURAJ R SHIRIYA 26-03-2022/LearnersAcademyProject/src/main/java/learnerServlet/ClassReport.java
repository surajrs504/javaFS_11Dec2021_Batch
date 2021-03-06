package learnerServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learnerBean.ClassBean;
import learnerService.ClassReportService;

/**
 * Servlet implementation class ClassReport
 */
@WebServlet("/ClassReport")
public class ClassReport extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int cno=Integer.parseInt(request.getParameter("cno"));
		ClassReportService cs= new ClassReportService();
		List<ClassBean> list =cs.classdetails(cno);
		
		if(list.isEmpty()) {
			response.sendRedirect("invalidAdminDetails.html");
		}
		else {
			response.sendRedirect("ClassReport.jsp?cno="+cno);
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
