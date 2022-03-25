<%@page import="flyawaybean.adminbean"%>
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

<% 
List<adminbean> list =(List<adminbean>) request.getAttribute("listSchedule");
%>
<table border=5 align=center>
<tr><th colspan=4>LIST OF AIRLINE, SOURCE, DESTINATION, TICKET PRICE</th></tr>
<tr>
<th>airline</th>
<th>source</th>
<th>destination
<th>ticket price</th></tr>
<% for(adminbean b:list){ %>
<tr><td><%=b.getAirline() %>
<td> <%=b.getSource() %> </td>
<td> <%= b.getDestination() %></td>
<td><%= b.getTicketprice() %></td>

</tr>
<%
}
%>
</table>
</body>
</html>