<%@page import="java.util.List"%>
<%@page import="learnerBean.ClassBean"%>
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
<h3 align= center>CLASS REPORT</h3>
<form action="ClassReport" method="get">
<table border=5 align=center>
<tr><th>CLASS</th><th> select class</th></tr>
<%
ClassService ss = new ClassService();
List<ClassBean> list =ss.listclass();
for(ClassBean b:list){

%>
<tr><td><%= b.getClno() %></td>
<td><input type="radio" value="<%= b.getClno() %>" name="cno" 
required="required" /></td></tr>

<%} %>

		<tr><td colspan=2>
		<input type="reset" value="reset" name="reset" />
		<input type="submit" value="search" name="submit" /></td></tr>
</table>
</form>


</body>
</html>