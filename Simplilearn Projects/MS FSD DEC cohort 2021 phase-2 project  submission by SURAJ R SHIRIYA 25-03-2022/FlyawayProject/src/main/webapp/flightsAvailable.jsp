<%@page import="flyawayService.SearchService"%>
<%@page import="flyawaybean.searchBean"%>
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
<h1 align=center>LIST OF FLIGHTS AVAILABLE</h1>
<%  
try{

List<searchBean> list =(List<searchBean>) request.getAttribute("listFA");
String date=String.valueOf(request.getAttribute("date"));
String nullseat=String.valueOf(request.getAttribute("nullseat"));

%>


<%
 		
if(list.isEmpty()) { 
	%>
	<h3 align=center> looks like the flight you searched is not available</h3>
	<% }
else { 
		
		int a=0;
		
	for(searchBean b:list){ 
		 String ndate= b.getFdate();
		String newdate=ndate.substring(0,10);
		
%>
	
<form action=RedirectServlet  method=GET>
<table border=1 align="center">
	<%if(newdate.equals(date)){ 
		%>
	
	<tr><th>select</th><th>DATE</th><th>AIRLINE</th><th>Flight Number</th><th>SOURCE</th><th>DESTINATION</th><th>SEATS AVAILABLE</th></tr>
	<tr>
	<td><input type="checkbox" value="<%= b.getFno() %>" name="check"/></td>
	<td> <%=newdate %> </td>
	<td> <%= b.getAirline() %>
	<td> <%=b.getFno() %> </td>
	<td> <%=b.getSource() %> </td>
	<td> <%=b.getDestination() %> </td>
	<td> <%=b.getSeats()   %> </td>
	<td rowspan=1><input type=submit value=book name=submit/></td>
	</tr>
	
	</table>
	</form>
	<% a++;
	}
	
	
	} 
	
	if(a==0){ %>
	
	 <h3 align=center> looks like the flight you searched is not available</h3>
	
	<% 
	}
	}
}
catch(Exception ex){%>
	 <h3 align=center> looks like the flight you searched is not available</h3>
<% }
 %>
	
	
	

</body>
</html>