<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align=center>PAYMENT PAGE</h1>
<form action="orderconfirmservlet">
<table border=5 align=center>
			<tr align=center><td colspan=2>Personal Details<td></td>
			<tr>
			<td>Full Name</td>
            <td><input type="text" id="fname" name="firstname" required="required"></td>
            </tr>
            
            <tr>
            <td> Email</td>
            <td><input type="text" id="email" name="email" required="required"></td>
           </tr>
            
            <tr>
           	<td>City</td>
            <td><input type="text" id="city" name="city" required="required" ></td>
            </tr>
             
             <tr>
            <td> Name on Card</td>
            <td><input type="text" id="cname" name="cardname" required="required"></td>
           </tr>
           
           <tr>
           <td>Credit card number</td>
            <td><input type="text" id="ccnum" name="cardnumber" required="required" ></td>
            </tr>
            
            <tr>
            <td>Exp Month</td>
            <td><input type="text" id="expmonth" name="expmonth" required="required"></td>
            </tr>
            <tr align=center><td colspan=2>
            <input  type=submit value=pay  name=submit /></td></tr>
            </table>
 </form>
</body>
</html>