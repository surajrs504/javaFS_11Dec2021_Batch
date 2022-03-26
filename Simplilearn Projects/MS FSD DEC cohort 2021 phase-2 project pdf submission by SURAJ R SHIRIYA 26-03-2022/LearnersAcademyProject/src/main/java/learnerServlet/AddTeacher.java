package learnerServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learnerBean.StudentBean;
import learnerBean.TeacherBean;
import learnerService.StudentService;
import learnerService.TeacherService;

/**
 * Servlet implementation class AddTeacher
 */
@WebServlet("/AddTeacher")
public class AddTeacher extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try {
		int tno = Integer.parseInt(request.getParameter("tno"));
		//String rno=String.valueOf(no);
		String fname= request.getParameter("fname");
		String lname= request.getParameter("lname");
		String subject= request.getParameter("subject");
		int sclass = Integer.parseInt(request.getParameter("sclass"));
		TeacherBean sb= new TeacherBean();
		sb.setTno(tno);
		sb.setFname(fname);
		sb.setLname(lname);
		sb.setSubject(subject);
		sb.setTclass(sclass);
		TeacherService ss= new TeacherService();
		boolean b=ss.AddTeacher(sb);
		int k=0;
		if(b) {k=1;
			 response.sendRedirect("TeacherAddedOrNot.jsp?k="+k);  
		}
		else
		{
			 response.sendRedirect("TeacherAddedOrNot.jsp?k="+k);  
		}
		}
		catch(Exception ex) {
			int k=0;
			response.sendRedirect("TeacherAddedOrNot.jsp?k="+k);  
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
