package learnerServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import learnerBean.TeacherBean;
import learnerService.TeacherService;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String subject = request.getParameter("subject");
		int sclass = Integer.parseInt(request.getParameter("sclass"));
		HttpSession sessions= request.getSession();
		//int tno =(int)request.getAttribute("tno");
		TeacherBean tb= new TeacherBean();
		int tno=Integer.parseInt(request.getParameter("tno"));
		System.out.println(tno);
		TeacherService ts= new TeacherService();
		tb.setSubject(subject);
		tb.setTclass(sclass);
		tb.setTno(tno);
		boolean value = ts.UpdateTeacher(tb);
		int k=0;
		if(value) {k=1;
			 response.sendRedirect("TeacherUpdatedOrNot.jsp?k="+k);  
		}
		else
		{
			 response.sendRedirect("TeacherUpdatedOrNot.jsp?k="+k);  
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
