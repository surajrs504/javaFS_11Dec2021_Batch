package learnerDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import learnerBean.LoginBean;



public class AdminLoginDao {

	public static void main(String[] args) {
		AdminLoginDao a = new AdminLoginDao();
		LoginBean b= a.adminLogin("adminuser");
		System.out.println(b.getUsername()+b.getPassword());
		

	}
	
	public LoginBean adminLogin( String username) {
		LoginBean l=new LoginBean();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
			System.out.println("connection loaded");
			Statement stmt=con.createStatement();
			String query="select * from flyawayadmin where USERNAME='"+username+"'";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				l.setUsername(rs.getString(1));
				l.setPassword(rs.getString(2));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}

}
