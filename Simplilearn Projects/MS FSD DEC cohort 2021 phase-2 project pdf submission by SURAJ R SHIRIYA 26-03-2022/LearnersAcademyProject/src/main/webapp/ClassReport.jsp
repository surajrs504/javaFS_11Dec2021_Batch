<%@page import="learnerBean.StudentBean"%>
<%@page import="learnerService.ClassReportService"%>
<%@page import="java.lang.reflect.Array"%>
<%@page import="java.util.ArrayList"%>
<%@page import="learnerBean.ClassBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3 align=center>STUDENT DETAILS</h3>
<table border=5 align=center>

<tr><th>rno</th><th>fname</th><th>lname</th><th>class</th></tr>
<%
ClassReportService cr= new ClassReportService();
int cno=Integer.parseInt(request.getParameter("cno"));
List<StudentBean> lists= cr.StudentClassDetails(cno);
for(StudentBean b:lists){

%>
<tr><td><%= b.getRno() %></td><td><%= b.getFname() %></td><td><%= b.getLname() %></td><td><%= b.getSclass() %></td>
</tr>

<%} %>

		
</table>

<br><br>
<h3 align=center>SUBJECT AND TEACHER ASSIGNED DETAILS</h3>
<table border=5 align=center>
>
<tr><th>Subject-1</th><th>Subject-2</th><th>Subject-3</th>
<th>Subject-1 Teacher</th><th>Subject-2 Teacher</th><th>Subject-3 Teacher</th></tr>
<%

List<ClassBean> listc= cr.classdetails(cno);
for(ClassBean b:listc){

%>
<tr><td><%= b.getsOne() %></td><td><%= b.getsTwo() %></td><td><%= b.getsThree() %></td>
<td><%= b.getsOneT() %></td><td><%= b.getsTwoT() %></td><td><%= b.getsThreeT() %></td>
</tr>

<%} %>
		

		
</table>

<table align=center><tr>
		<td colspan=4>
		<a href="adminpage.html">
		   <input type="button" value="go back to adminpage" />
		</a>
		</td></tr></table>

</body>
</html>