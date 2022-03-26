<%@page import="learnerBean.ClassBean"%>
<%@page import="java.util.List"%>
<%@page import="learnerService.ClassService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align=center> CLASS LIST</h1>
<form action="DeleteClassList" method="get">
<table border=5 align=center>
<tr><th>CLASS</th><th> select to delete</th></tr>
<%
ClassService ss = new ClassService();
List<ClassBean> list =ss.listclass();
for(ClassBean b:list){

%>
<tr><td><%= b.getClno() %></td>
<td><input type="radio" value="<%= b.getClno() %>" name="delete" required="required"/></td></tr>

<%} %>
		<tr>
		<td colspan=1>
		<a href="adminpage.html">
		   <input type="button" value="go back to adminpage" />
		</a>
		<a href="AddClassDetails.jsp">
		   <input type="button" value="add new class" />
		</a>
		</td>

		<td><input type="reset" value="reset" name="reset" />
		<input type="submit" value="delete" name="submit" /></td></tr>
</table>
</form>

</body>
</html>