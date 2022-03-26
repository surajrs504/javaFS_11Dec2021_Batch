package learnerServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learnerService.StudentService;
import learnerService.SubjectService;

/**
 * Servlet implementation class DeleteSubject
 */
@WebServlet("/DeleteSubject")
public class DeleteSubject extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		

		int sno = Integer.parseInt(request.getParameter("delete"));
		SubjectService ss= new SubjectService();
		boolean b=ss.DeleteSubject(sno);
		int k=0;
		if(b) {k=1;
			 response.sendRedirect("SubjectDeletedOrNot.jsp?k="+k);  
		}
		else
		{
			 response.sendRedirect("SubjectDeletedOrNot.jsp?k="+k);  
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
