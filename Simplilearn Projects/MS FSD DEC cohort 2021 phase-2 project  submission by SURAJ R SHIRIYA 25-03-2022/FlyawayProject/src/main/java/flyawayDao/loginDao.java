package flyawayDao;


import java.sql.*;
import java.sql.DriverManager;

import flyawaybean.loginBean;

public class loginDao {

	
public loginBean loginmeth(String username) {
	loginBean l=new loginBean();
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
		System.out.println("connection loaded");
		Statement stmt=con.createStatement();
		String query="select * from flyawayadmin where USERNAME='"+username+"'";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			l.setusername(rs.getString(1));
			l.setpassword(rs.getString(2));
			
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return l;
}
}