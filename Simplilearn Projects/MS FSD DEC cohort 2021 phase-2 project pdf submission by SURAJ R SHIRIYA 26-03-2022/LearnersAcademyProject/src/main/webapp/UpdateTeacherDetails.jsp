<%@page import="learnerService.TeacherService"%>
<%@page import="learnerBean.TeacherBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
HttpSession sessions= request.getSession();
int tno = Integer.parseInt(request.getParameter("tno"));
//String hello=String.valueOf(request.getAttribute("hello"));
//String hello=String.valueOf(request.getParameter("hello"));
TeacherBean u = new TeacherBean();
TeacherService ts= new TeacherService();
TeacherBean tb=ts.teacherdetail(tno);
session.setAttribute("tno", tb.getTno());
u.setTno(tno);
%>


<form action="UpdateServlet">
<table border=5 align=center>
			<tr align=center><td colspan=2>Personal Details<td></td>
			
			 <tr>
            <td> Tno</td>
            <td><%=tb.getTno() %></td>
            
           </tr>
           
			<tr>
			<td>First Name</td>
            <td><%=tb.getFname() %></td>
            </tr>
            
            <tr>
            <td> last name</td>
            <td><%=tb.getLname() %></td>
           </tr>
           
             <tr>
           	<td>subject</td>
            <td><input type="text" id="subject" name="subject" required="required" ></td>
            </tr>
            <tr>
            
            <input type="hidden" id="custId" name="tno" value="<%= tb.getTno() %>">
           	<td>class</td>
            <td><input type="number" id="sclass" name="sclass" required="required" ></td>
            </tr>
             
           
            <tr align=center><td colspan=2>
            <input  type=submit value=submit  name=submit /></td></tr>
            </table>
 </form>


</body>
</html>