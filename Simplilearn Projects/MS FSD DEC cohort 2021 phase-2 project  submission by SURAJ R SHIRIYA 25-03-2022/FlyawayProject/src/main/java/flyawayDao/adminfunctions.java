package flyawayDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import flyawaybean.adminbean;

public class adminfunctions {
	
	
public boolean changePwd(String password) {
	
		
		boolean b=false;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
			System.out.println("connection loaded");
			Statement stmt=con.createStatement();
			String query="update flyawayadmin set password='"+password+"' where username='adminuser'";
			int c = stmt.executeUpdate(query);
			
			if(c>0) {
				System.out.println("update successfull");
	
				b=true;
				
			}
			else
			{
				System.out.println("update unsuccessfull");
	
				b=false;
			}
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return b;
}

public List<adminbean> listOfSourceAndDestination() {
	ArrayList<adminbean> list=new ArrayList<adminbean>();
	
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
		System.out.println("connection loaded");
		Statement stmt=con.createStatement();
		String query="select distinct source, destination from suraj.flightdb";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
	
			adminbean ad= new adminbean();
			ad.setSource(rs.getString(1));
			
			ad.setDestination(rs.getString(2));
			list.add(ad);
		}
		
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return list;
	
	
}

public List<adminbean> listOfAirlines() {
	ArrayList<adminbean> listAirline=new ArrayList<adminbean>();
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
		System.out.println("connection loaded");
		Statement stmt=con.createStatement();
		String query="select distinct airline from flightdb";
		ResultSet rs=stmt.executeQuery(query);
		System.out.println("AIRLINES");
		while(rs.next()) {
			adminbean a= new adminbean();
			a.setAirline(rs.getString(1));
			listAirline.add(a);
			
		}
		
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		if(listAirline.isEmpty()) {
			System.out.println("list is empty");
		}
		else {
			System.out.println("list is not empty");
		}
		
		return listAirline;
}



public List<adminbean> airlineSchedule() {
	ArrayList<adminbean> schedulelist=new ArrayList<adminbean>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
		System.out.println("connection loaded");
		Statement stmt=con.createStatement();
		String query="select airline,source,destination,ticket_price from flightdb";
		ResultSet rs=stmt.executeQuery(query);
		System.out.println(" airline		,source		,destination,		ticket_price");
		while(rs.next()) {
			
			adminbean adb= new adminbean();
			System.out.println(rs.getString(1)+rs.getString(2));
			adb.setAirline(rs.getString(1));
			adb.setSource(rs.getString(2));
			adb.setDestination(rs.getString(3));
			adb.setTicketprice(rs.getInt(4));
			schedulelist.add(adb);
			
		}
		
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return schedulelist;
}

}
