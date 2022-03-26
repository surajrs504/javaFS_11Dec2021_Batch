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
<h3 align=center> Student was not added :( , check entered student details </h3>
<br><div align=center>
<a href="addstudentdetail.html">
		   <input type="button" value="Try again" />
		</a>
		<br><br>
		<a href="adminpage.html">
		   <input type="button" value="go back to adminpage" />
		</a>
		</div>
<%} else{
%><div align=center>
<h3 align=center> Student was  added :)  </h3>
<br>
<a href="StudentList.jsp">
		   <input type="button" value="add one more" />
		</a><br><br>
<a href="adminpage.html">
		   <input type="button" value="go back to adminpage" />
		</a></div>
<%} %>
</body>
</html>