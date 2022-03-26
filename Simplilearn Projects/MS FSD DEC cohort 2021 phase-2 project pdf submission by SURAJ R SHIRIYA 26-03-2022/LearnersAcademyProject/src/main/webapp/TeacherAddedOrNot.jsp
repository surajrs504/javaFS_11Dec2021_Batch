<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% int k= Integer.parseInt(request.getParameter("k"));
if(k==0){%>
<h3 align=center> Teacher was not added :(  check your input, 
if problem persist contact developer at dev@learnerAcademy.com   </h3>
<br><div align=center>
<a href="addteacherdetail.html">
		   <input type="button" value="Tryagain" />
		</a></div>
<%} else{
%><div align=center>
<h3 align=center> Student was  added :)  </h3>
<br>
<a href="addteacherdetail.html">
		   <input type="button" value="Add new teacher" />
		</a></div>
<%} %>

<br><br>
<div align=center>
<a href="adminpage.html">
		   <input type="button" value="go back to adminpage" />
		</a></div>

</body>
</html>