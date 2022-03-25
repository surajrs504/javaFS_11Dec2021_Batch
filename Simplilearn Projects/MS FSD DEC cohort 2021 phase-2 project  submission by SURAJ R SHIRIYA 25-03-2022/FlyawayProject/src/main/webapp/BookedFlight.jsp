<%@page import="java.util.List"%>
<%@page import="flyawaybean.searchBean"%>
<%@page import="flyawayService.SearchService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align=center>FLIGHT DETAILS</h3>
<form action=onlinepayment.jsp method=>
<table border=5 align=center>
<%  HttpSession sessionn=request.getSession(); 
int seats=(int)sessionn.getAttribute("seats");
String f=String.valueOf(sessionn.getAttribute("flightNo"));
SearchService ss= new SearchService();
searchBean sb=new searchBean();
sb.setFno(f);
List<searchBean> AList=ss.alldetails(sb);
for(searchBean b:AList){ 
	String ndate= b.getFdate();
	String newdate=ndate.substring(0,10);
%>
<tr>
<td>DATE</td>
<td>FLIGHT-NO</td>
<td>AIRLINE</td>
<td>SOURCE</td>
<td>DESTINATION</td>
<td>TIME</td>
<td>TICKET PRICE</td>
<td> SEATS</td>
<td>TOTAL AMOUNT</td>
</tr>
 
<tr>

<td><%= newdate %></td>
<td> <%=b.getFno() %> </td>
<td><%= b.getAirline()%></td>
<td> <%=b.getSource() %> </td>
<td> <%=b.getDestination() %> </td>
<td><%=b.getTime() %></td>
<td><%=b.getTicketPrice() %></td>
<td> <%=seats   %> </td>
<% int amount=0;
int ticketprice=b.getTicketPrice();
amount=(ticketprice*seats);
%>
<td><%=amount %></td>
</tr>

<tr>
<td colspan=9 align=center><input  type=submit value="CLICK TO PAY AND BOOK TICKETS"  name=submit /></input</td>

</tr>
<% } %>
</table>
</form>
</body>
</html>