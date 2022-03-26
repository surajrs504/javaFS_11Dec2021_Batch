package learnerDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import learnerBean.ClassBean;
import learnerBean.StudentBean;

public class ClassDao {

	public List<StudentBean> studentlist() {
		 ArrayList<StudentBean> alldetails=new ArrayList<StudentBean>();
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver loaded");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
				System.out.println("connection loaded");
				Statement stmt=con.createStatement();
				String query="select * from student ";
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next()) {
					StudentBean sb= new StudentBean();
					sb.setRno((rs.getInt(1)));
					sb.setFname((rs.getString(2)));
					sb.setLname((rs.getString(3)));
					sb.setSclass((rs.getInt(4)));
					alldetails.add(sb);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return alldetails;
	 }
	 
	 public boolean deleteStudent (int rno) {
		 StudentBean sb= new StudentBean();
		 boolean value=false;
		 try {  
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver loaded");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
				System.out.println("connection loaded");
				Statement stmt=con.createStatement();
				String query="delete from student where rno="+ rno;
				int count = stmt.executeUpdate(query);
				if(count>0)
				{
					value=true;
					
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		 return value;
	 }
	 
	 public boolean addStudent (StudentBean bean) {
		 StudentBean sb= new StudentBean();
		 boolean value=false;
		 try {  
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver loaded");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
				System.out.println("connection loaded");
				Statement stmt=con.createStatement();
				String query="insert into student values("+bean.getRno()+","
						+ "'"+bean.getFname()+"','"+bean.getLname()+"',"+bean.getSclass()+")";
				int count = stmt.executeUpdate(query);
				if(count>0)
				{
					value=true;
					
				}
				
				
			} catch (Exception e) {
				return value;
			}
			
		 return value;
	 }
	
}
