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
HttpSession sessionup= request.getSession();

String err=String.valueOf(sessionup.getAttribute("err"));
String invalidpass=String.valueOf(sessionup.getAttribute("invalidpass"));

if(err=="usernameOrPassword"){ %>

<h3 align=center> something went wrong , check your username and password, if problem repeats contact admin at dev@flyaway.com </h3>
<h3 align=center> <a href=adminloginpage.html > click here to try again</a></h3>
<%}
else if(invalidpass=="invalidpass"){%>
<h3 align=center> something went wrong , check your password, if problem repeats contact admin at dev@flyaway.com </h3>
<h3 align=center> <a href=adminloginpage.html > click here to try again</a></h3>
<%} %>
</body>
</html>