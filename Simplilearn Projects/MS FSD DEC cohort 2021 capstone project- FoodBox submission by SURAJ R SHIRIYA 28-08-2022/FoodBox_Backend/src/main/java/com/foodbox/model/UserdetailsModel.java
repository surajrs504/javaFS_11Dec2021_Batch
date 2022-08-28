package com.foodbox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserdetailsModel {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public int id;
	public String username;
	public Long phonenumber;
	public String emailid;
	public String password;
	public UserdetailsModel() {
		super();
	}

	public UserdetailsModel(int id, String username, Long phonenumber, String emailid, String password) {
		super();
		this.id = id;
		this.username = username;
		this.phonenumber = phonenumber;
		this.emailid = emailid;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
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

	public UserdetailsModel(String emailid, String password) {
		super();
		this.emailid = emailid;
		this.password = password;
	}

	public UserdetailsModel(String username) {
		super();
		this.username = username;
	}
	
	
	
}
