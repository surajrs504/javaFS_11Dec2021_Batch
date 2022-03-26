<%@page import="learnerBean.TeacherBean"%>
<%@page import="java.util.List"%>
<%@page import="learnerService.TeacherService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="AddClassServlet">
<table border=5 align=center>
			<tr align=center><td colspan=2>Personal Details<td></td>
           
			<tr>
			<td>CLASS</td>
            <td><input type="number" id="cclass" name="cclass" required="required"></td>
            </tr>
            <%
TeacherService ts= new TeacherService();
List<TeacherBean> bean= ts.liststudent();


%>
             <tr>
            <td> Subject-1</td>
            
           <td> <select  name="subjectOne">
            <%
            for(TeacherBean b: bean){
            %>
 			 <option value="<%= b.getSubject() %>"> <%= b.getSubject() %></option>
 			 
 			 <%} %>
 			 </select>
 			 
 			 </td>
           
           </tr>
           
            <tr>
            <td> Subject-2</td>
            <td> <select  name="subjectTwo">
            <%
            for(TeacherBean b: bean){
            %>
 			 <option value="<%= b.getSubject() %>"> <%= b.getSubject() %></option>
 			 
 			 <%} %>
 			 </select>
 			 
 			 </td>
           
           </tr>
            <tr>
            <td> Subject-3</td>
            
             <td> <select  name="subjectThree">
            <%
            for(TeacherBean b: bean){
            %>
 			 <option value="<%= b.getSubject() %>"> <%= b.getSubject() %></option>
 			 
 			 <%} %>
 			 </select>
 			 
 			 </td>
            
           </tr>
            <tr>
            <td>Subject-1 teacher</td>
 			
 			<td> <select  name="subjectOneT">
            <%
            for(TeacherBean b: bean){
            %>
 			 <option value="<%= b.getFname()+" "+b.getLname() %>"> <%= b.getFname()+" "+b.getLname() %></option>
 			 
 			 <%} %>
 			 </select>
 			 
 			 </td>
 			
 			          
           </tr>
           
           
            <tr>
            <td> Subject-2 teacher</td>
           <td> <select  name="subjectTwoT">
            <%
            for(TeacherBean b: bean){
            %>
 			 <option value="<%= b.getFname()+" "+b.getLname() %>"> <%= b.getFname()+" "+b.getLname() %></option>
 			 
 			 <%} %>
 			 </select>
 			 
 			 </td>
           
           
           </tr>
           
           
            <tr>
            <td> Subject-3 teacher</td>
            
            <td> <select  name="subjectThreeT">
            <%
            for(TeacherBean b: bean){
            %>
 			 <option value="<%= b.getFname()+" "+b.getLname() %>"> <%= b.getFname()+" "+b.getLname() %></option>
 			 
 			 <%} %>
 			 </select>
 			 
 			 </td>
            
           </tr>
            
           
            <tr align=center>
            
            <td colspan=2>
		
            <input  type=submit value=add  name=submit /><br><br>
            <a href="adminpage.html">
		   <input type="button" value="go back to adminpage" />
		</a>
            
            </td></tr>
            </table>
 </form>

</body>
</html>