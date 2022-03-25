package flyawaybean;

import java.util.Date;

public class searchBean {
private String airline;
private String source;
private String destination;
private int seats;
private String fdate;
private String fno;
private String time;
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public int getTicketPrice() {
	return TicketPrice;
}
public void setTicketPrice(int ticketPrice) {
	TicketPrice = ticketPrice;
}
private int TicketPrice;

public String getFno() {
	return fno;
}
public void setFno(String fno) {
	this.fno = fno;
}
public String getFdate() {
	return fdate;
}
public void setFdate(String date) {
	this.fdate = date;
}
public String getAirline() {
	return airline;
}
public void setAirline(String airline) {
	this.airline = airline;
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
public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}



}
