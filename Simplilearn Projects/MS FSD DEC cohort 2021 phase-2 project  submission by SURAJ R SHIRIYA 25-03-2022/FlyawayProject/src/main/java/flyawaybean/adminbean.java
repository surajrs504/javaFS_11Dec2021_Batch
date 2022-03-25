package flyawaybean;

public class adminbean {
	private String password;
	private boolean count;
	private String source;
	private String destination;
	private int ticketprice;
	private String airline;
	
	
	
	public String getpassword()
	{
		return password;
	}
	public void setpassword(String password) {
		this.password=password;
	}

	
	public boolean getcount() {
		return count;
	}
	
	public void setcount(boolean count) {
		this.count=count;
	}
	
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	public int getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(int ticketprice) {
		this.ticketprice = ticketprice;
	}
	
	
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
}
