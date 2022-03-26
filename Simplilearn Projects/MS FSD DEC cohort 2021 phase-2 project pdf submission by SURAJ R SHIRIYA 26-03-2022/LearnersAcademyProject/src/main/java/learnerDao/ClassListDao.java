package learnerDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import learnerBean.ClassBean;
import learnerBean.StudentBean;

public class ClassListDao {

	 public List<ClassBean> classlist() {
		 ArrayList<ClassBean> alldetails=new ArrayList<ClassBean>();
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver listloaded");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
				System.out.println("connection loaded");
				Statement stmt=con.createStatement();
				String query="select class_no from classlist ";
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next()) {
					ClassBean sb= new ClassBean();
					sb.setClno((rs.getInt(1)));
					alldetails.add(sb);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return alldetails;
	 }
	 
	 public boolean deleteClass (int clno) {
		 ClassBean sb= new ClassBean();
		 boolean value=false;
		 try {  
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver loaded");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
				System.out.println("connection loaded");
				Statement stmt=con.createStatement();
				String query="delete from classlist where class_no="+ clno;
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
	 
	 public boolean addClass (ClassBean bean) {
		 ClassBean sb= new ClassBean();
		 boolean value=false;
		 try {  
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver loaded");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
				System.out.println("connection loaded");
				Statement stmt=con.createStatement();
				String query="insert into classlist values("+bean.getClno()
				+",'"+bean.getsOne()+"','"+bean.getsTwo()+"','"+bean.getsThree()+"','"+
						bean.getsOneT()+"','"+bean.getsTwoT()+"','"+
				bean.getsThreeT()+"')";
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
	 public List<ClassBean> classreportlist(int cno) {
		 ArrayList<ClassBean> alldetails=new ArrayList<ClassBean>();
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver listloaded");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
				System.out.println("connection loaded");
				Statement stmt=con.createStatement();
				String query="select * from classlist where class_no= "+cno;
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next()) {
					ClassBean sb= new ClassBean();
					sb.setClno((rs.getInt(1)));
					sb.setsOne((rs.getString(2)));
					sb.setsTwo((rs.getString(3)));
					sb.setsThree((rs.getString(4)));
					sb.setsOneT((rs.getString(5)));
					sb.setsTwoT((rs.getString(6)));
					sb.setsThreeT((rs.getString(7)));
					
					alldetails.add(sb);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return alldetails;
}
}
