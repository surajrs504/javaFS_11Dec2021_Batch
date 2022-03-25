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
<h3 align=center> your order has been confirmed , please find your order details below</h3>
<%
HttpSession ssi=request.getSession();

String fname=String.valueOf(ssi.getAttribute("fname"));
String lname=String.valueOf(ssi.getAttribute("lname"));
String age=String.valueOf(ssi.getAttribute("age"));
String mno=String.valueOf(ssi.getAttribute("mno"));
String gender=String.valueOf(ssi.getAttribute("gender"));
String country=String.valueOf(ssi.getAttribute("country"));
int seats=(int)ssi.getAttribute("noseats");
String fnum=String.valueOf(ssi.getAttribute("fnum"));


SearchService ss= new SearchService();
searchBean sb=new searchBean();
sb.setFno(fnum);
List<searchBean> AList=ss.alldetails(sb);
for(searchBean b:AList){ 
	String ndate= b.getFdate();
	String newdate=ndate.substring(0,10);
	int amount=0;
	int ticketprice=b.getTicketPrice();
	amount=(ticketprice*seats);

%>
<table border =5 align=center>
<tr align=center><td colspan=9> Flight Booking Details</td></tr>
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
<td> <%=amount   %> </td>
</tr>
<%} %>
</table>
<br><br>

<table border=5 align=center>
<tr align=center><td colspan=9> Customer Details</td></tr>
<tr>
<td>First name</td>
<td>Last name</td>
<td>Age</td>
<td>Contact number</td>
<td>Gender</td>
<td>Country</td>
</tr>
<tr>
<td><%= fname %></td>
<td><%= lname %></td>
<td><%= age %></td>
<td><%= mno %></td>
<td><%= gender %></td>
<td><%= country %></td>
</tr>


</table>
<h3 align=center> <a href=homepage.html > Go Back to Home Page</a></h3>


</body>
</html>