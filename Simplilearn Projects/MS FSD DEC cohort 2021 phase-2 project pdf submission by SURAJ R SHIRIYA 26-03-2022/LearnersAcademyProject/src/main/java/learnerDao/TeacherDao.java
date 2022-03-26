package learnerDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import learnerBean.TeacherBean;

public class TeacherDao {

	public List<TeacherBean> teacherlist() {
		 ArrayList<TeacherBean> alldetails=new ArrayList<TeacherBean>();
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver loaded");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
				System.out.println("connection loaded");
				Statement stmt=con.createStatement();
				String query="select * from teacher ";
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next()) {
					System.out.println(rs.getInt(1));
					TeacherBean sb= new TeacherBean();
					sb.setTno((rs.getInt(1)));
					sb.setFname((rs.getString(2)));
					sb.setLname((rs.getString(3)));
					sb.setSubject((rs.getString(4)));
					sb.setTclass((rs.getInt(5)));
					
					
					alldetails.add(sb);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return alldetails;
	 }
	 
	 public boolean deleteteacher (int tno) {
		 TeacherBean sb= new TeacherBean();
		 boolean value=false;
		 try {  
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver loaded");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
				System.out.println("connection loaded");
				Statement stmt=con.createStatement();
				String query="delete from teacher where tno="+ tno;
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
	 
	 public boolean addteacher (TeacherBean bean) {
		 TeacherBean sb= new TeacherBean();
		 boolean value=false;
		 try {  
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver loaded");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
				System.out.println("connection loaded");
				Statement stmt=con.createStatement();
				String query="insert into teacher values("+bean.getTno()+","
						+ "'"+bean.getFname()+"','"+bean.getLname()+"','"+bean.getSubject()+"',"+bean.getTclass()+")";
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
	 
	 public TeacherBean oneTeacherDetail(int tno) {
		 TeacherBean sb= new TeacherBean();
	 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
			System.out.println("connection loaded");
			Statement stmt=con.createStatement();
			String query="select * from teacher where tno="+tno;
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				
				sb.setTno((rs.getInt(1)));
				sb.setFname((rs.getString(2)));
				sb.setLname((rs.getString(3)));
				sb.setSubject((rs.getString(4)));
				sb.setTclass((rs.getInt(5)));
				
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb;
	
}
	 public boolean updateTeacher (TeacherBean bean) {
		 TeacherBean sb= new TeacherBean();
		 boolean value=false;
		 try {  
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver loaded");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
				System.out.println("connection loaded");
				Statement stmt=con.createStatement();
				String query="update teacher set subject='"+bean.getSubject()+"', class="+bean.getTno()+
						" where tno="+bean.getTno();
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
}
