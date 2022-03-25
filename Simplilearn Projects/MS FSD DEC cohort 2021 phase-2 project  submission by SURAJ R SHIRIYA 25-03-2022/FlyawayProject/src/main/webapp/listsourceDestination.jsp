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
List<adminbean> list =(List<adminbean>) request.getAttribute("listSD");
%>
<table border=5 align=center>
<tr><th colspan=2>LIST OF SOURCE AND DESTINATION</th></tr>
<tr>
<th>source</th>
<th>destination</tr>

<% for(adminbean b:list){ %>
<tr><td> <%=b.getSource()%> </td>
<td> <%= b.getDestination() %></td>

</tr>
<%
}
%>
</table>
</body>
</html>