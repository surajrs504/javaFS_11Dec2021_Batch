<%@page import="learnerBean.TeacherBean"%>
<%@page import="java.util.List"%>
<%@page import="learnerService.TeacherService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align=center>TEACHER'S LIST</h1>
<form action="DeleteTeacher" method="get">
<table border=5 align=center>
<tr><th>rno</th><th>fname</th><th>lname</th><th>subject</th><th>class</th><th> select to delete</th></tr>
<%
TeacherService ss = new TeacherService();
List<TeacherBean> list =ss.liststudent();
for(TeacherBean b:list){

%>
<tr><td><%= b.getTno() %></td><td><%= b.getFname() %></td><td><%= b.getLname() %></td><td>
<%= b.getSubject() %></td><td><%= b.getTclass() %></td></td><td><input type="radio" value="<%= b.getTno()%>" name="delete" required="required"/></td></tr>

<%} %>
		<tr>
		<td colspan=3>
		<a href="addteacherdetail.html">
		   <input type="button" value="add teacher" />
		</a>
		</td>

		<td colspan=3 >
		
		<input type="reset" value="reset" name="reset" />
		<input type="submit" value="delete" name="submit" />
		<input type="submit" value="update" name="submit" /></td></tr>
</table>
</form>

</body>
</html>