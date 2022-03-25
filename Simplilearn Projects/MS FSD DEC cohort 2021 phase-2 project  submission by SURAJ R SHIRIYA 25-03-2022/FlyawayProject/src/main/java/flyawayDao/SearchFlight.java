package flyawayDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import flyawaybean.adminbean;
import flyawaybean.searchBean;

public class SearchFlight {


	public List<searchBean> search(searchBean beanFromSearchForm) {
		System.out.println("fewfewfbefore everything");
		ArrayList<searchBean> sl=new ArrayList<searchBean>();
		System.out.println("before try");
		try {
					System.out.println("after try");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
			Statement stmt=con.createStatement();
			System.out.println("connection loaded");
					String dquery="alter session set NLS_DATE_FORMAT='yyyy-mon-dd'";
					int count= stmt.executeUpdate(dquery);
					String query="select  fdate,airline,flightno,source,destination,seats from flightdb where source='"+beanFromSearchForm.getSource()+"' "
							+ "and destination='"+beanFromSearchForm.getDestination()+"' and seats >= "+
					beanFromSearchForm.getSeats();
					ResultSet rs=stmt.executeQuery(query);
					while(rs.next()) {
						searchBean sb= new searchBean();
						sb.setFdate((rs.getString(1)));
						sb.setAirline((rs.getString(2)));
						sb.setFno((rs.getString(3)));
						sb.setSource((rs.getString(4)));
						sb.setDestination((rs.getString(5)));
						sb.setSeats((rs.getInt(6)));
						sl.add((sb));	
						}
					
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		if(sl.isEmpty()) {
			System.out.println("list is emptyjyt");
		}
		else {
			System.out.println("list is not emptyjytjt");
		}
		return sl;
	}
	
	
	public List<searchBean> allFlightDetails( searchBean bean) {
		ArrayList<searchBean> alldetails=new ArrayList<searchBean>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","suraj","surajrs504");
			System.out.println("connection loaded");
			Statement stmt=con.createStatement();
			String dquery="alter session set NLS_DATE_FORMAT='yyyy-mon-dd'";
			int count= stmt.executeUpdate(dquery);
			String query="select * from flightdb where  FLIGHTNO='"+bean.getFno()+"'";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				searchBean sb= new searchBean();
				sb.setFdate((rs.getString(1)));
				sb.setFno((rs.getString(2)));
				sb.setAirline((rs.getString(3)));
				sb.setSource((rs.getString(4)));
				sb.setDestination((rs.getString(5)));
				sb.setTime((rs.getString(6)));
				sb.setTicketPrice((rs.getInt(7)));
				sb.setSeats((rs.getInt(8)));
				alldetails.add(sb);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return alldetails;
	}

}
