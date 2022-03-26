<%@page import="learnerBean.SubjectBean"%>
<%@page import="java.util.List"%>
<%@page import="learnerService.SubjectService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1 align=center> 	SUBJECT DETAILS</H1>
<form action="DeleteSubject" method="get">
<table border=5 align=center>
<tr><th>Sno</th><th>Subject</th><th> select to delete</th></tr>
<%
SubjectService ss = new SubjectService();
List<SubjectBean> list =ss.listSubjects();
for(SubjectBean b:list){

%>
<tr><td><%= b.getSno() %></td><td><%= b.getSubject() %></td>
<td>
<input type="radio" value="<%= b.getSno() %>" name="delete" required="required"/></td></tr>

<%} %>
		<tr>
		<td colspan=2>
		<a href="addsubjectdetails.html">
		   <input type="button" value="add subject" />
		</a>
		<a href="adminpage.html">
		   <input type="button" value="go back to adminpage" />
		</a>
		</td>

		<td>
		<input type="reset" value=" reset" name="reset" />
		<input type="submit" value="delete subject" name="submit" /></td></tr>
</table>
</form>


</body>
</html>