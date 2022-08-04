package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class userdetails {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private  int id;
	private int regnumber;
private String username;
private String firstname;
private String lastname;
private String emailid;
private String password;
private int phnnumber;
public userdetails() {
	super();
}
public userdetails(int id, int regnumber, String username, String firstname, String lastname, String emailid,
		String password, int phnnumber) {
	super();
	this.id = id;
	this.regnumber = regnumber;
	this.username = username;
	this.firstname = firstname;
	this.lastname = lastname;
	this.emailid = emailid;
	this.password = password;
	this.phnnumber = phnnumber;
}
public userdetails(int id) {
	super();
	this.id = id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getRegnumber() {
	return regnumber;
}
public void setRegnumber(int regnumber) {
	this.regnumber = regnumber;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getPhnnumber() {
	return phnnumber;
}
public void setPhnnumber(int phnnumber) {
	this.phnnumber = phnnumber;
}
@Override
public String toString() {
	return "userdetails [id=" + id + ", regnumber=" + regnumber + ", username=" + username + ", firstname=" + firstname
			+ ", lastname=" + lastname + ", emailid=" + emailid + ", password=" + password + ", phnnumber=" + phnnumber
			+ "]";
}



	
}
