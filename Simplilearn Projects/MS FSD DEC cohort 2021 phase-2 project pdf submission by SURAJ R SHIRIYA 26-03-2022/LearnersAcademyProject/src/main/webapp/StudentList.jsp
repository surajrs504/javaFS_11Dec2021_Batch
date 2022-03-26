<%@page import="java.util.List"%>
<%@page import="learnerService.StudentService"%>
<%@page import="learnerBean.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align=center> STUDENT DETAILS</h1>
<form action="DeleteStudent" method="get">
<table border=5 align=center>
<tr><th>rno</th><th>fname</th><th>lname</th><th>class</th><th> select to delete</th></tr>
<%
StudentService ss = new StudentService();
List<StudentBean> list =ss.liststudent();
for(StudentBean b:list){

%>
<tr><td><%= b.getRno() %></td><td><%= b.getFname() %></td><td><%= b.getLname() %></td><td>
<%= b.getSclass() %></td><td><input type="radio" value="<%= b.getRno() %>" name="delete" required="required"/></td></tr>

<%} %>
		<tr>
		<td colspan=4>
		<a href="adminpage.html">
		   <input type="button" value="go back to adminpage" />
		</a>
		<a href="addstudentdetail.html">
		   <input type="button" value="add student" />
		</a>
		</td>
		<td><input type="reset" value="reset" name="reset" />
		<input type="submit" value="delete" name="submit" /></td></tr>
</table>
</form>
</body>
</html>