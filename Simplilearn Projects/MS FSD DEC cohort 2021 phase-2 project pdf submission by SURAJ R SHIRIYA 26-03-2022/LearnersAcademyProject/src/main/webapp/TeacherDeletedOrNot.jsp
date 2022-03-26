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
<h3 align=center> Student was not deleted :( ,somthing went wrong</h3>
<br><div align=center>
<a href="TeacherList.jsp">
		   <input type="button" value="Tryagain" />
		</a>
		<br><br>
<a href="adminpage.html">
		   <input type="button" value="Go back to adminpage" />
		</a>
		
		
		</div>
<%} else{
%><div align=center>
<h3 align=center> Teacher was deleted :)  </h3>
<br>
<a href="TeacherList.jsp">
		   <input type="button" value="Delete one more" />
		</a><br><br>
<a href="adminpage.html">
		   <input type="button" value="Go back to adminpage" />
		</a></div>
<%} %>

</body>
</html>