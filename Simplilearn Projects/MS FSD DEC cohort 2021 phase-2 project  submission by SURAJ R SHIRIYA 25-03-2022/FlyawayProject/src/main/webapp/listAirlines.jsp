<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@page import="flyawaybean.adminbean"
import="javax.servlet.http.HttpServlet" %>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
List<adminbean> list =(List<adminbean>) request.getAttribute("listAirlines");
%>
<table border=5 align="center"><tr>
<th>LIST OF AIRLINE COMPANIES</th>
<% for(adminbean b:list){ %>
<tr><td> <%=b.getAirline() %> </td>


</tr>
<%
}
%>
</table>
</body>
</html>