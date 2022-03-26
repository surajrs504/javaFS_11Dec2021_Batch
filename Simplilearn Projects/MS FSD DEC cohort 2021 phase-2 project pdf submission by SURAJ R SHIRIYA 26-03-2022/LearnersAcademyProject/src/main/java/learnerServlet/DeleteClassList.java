package learnerServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learnerService.ClassService;
import learnerService.StudentService;

/**
 * Servlet implementation class DeleteClassList
 */
@WebServlet("/DeleteClassList")
public class DeleteClassList extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	

		int clno = Integer.parseInt(request.getParameter("delete"));
		ClassService ss= new ClassService();
		boolean b=ss.deleteclass(clno);
		int k=0;
		if(b) {k=1;
			 response.sendRedirect("ClassDeletedOrNot.jsp?k="+k);  
		}
		else
		{
			 response.sendRedirect("ClassDeletedOrNot.jsp?k="+k);  
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
