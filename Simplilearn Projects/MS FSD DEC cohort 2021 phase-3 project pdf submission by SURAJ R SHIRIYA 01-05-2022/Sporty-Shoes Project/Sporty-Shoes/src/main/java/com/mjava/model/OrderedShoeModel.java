package com.mjava.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_orderinfo")
public class OrderedShoeModel {
	@Id
	@GeneratedValue
	private int orderid;
	private int shoeid ;
	private int category;
	private double price;
	private int quantity ;
	private Date date;
	
	private String name;
	private String imagelink;
	private double totalprice ;
	
	public OrderedShoeModel() {
		super();
	}
	
	public OrderedShoeModel(int orderid, int shoeid, int category, double price, int quantity, Date date, String name,
			String imagelink, double totalprice) {
		super();
		this.orderid = orderid;
		this.shoeid = shoeid;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.date = date;
		this.name = name;
		this.imagelink = imagelink;
		this.totalprice = totalprice;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getOrderid() {
		return orderid;
	}
	
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	
	public int getShoeid() {
		return shoeid;
	}
	
	public void setShoeid(int shoeid) {
		this.shoeid = shoeid;
	}
	
	public int getcategory() {
		return category;
	}
	
	public void setcategory(int category) {
		this.category = category;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getImagelink() {
		return imagelink;
	}
	
	public void setImagelink(String imagelink) {
		this.imagelink = imagelink;
	}
	
	public double getTotalprice() {
		return totalprice;
	}
	
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "OrderedShoeModel [orderid=" + orderid + ", shoeid=" + shoeid + ", category=" + category + ", price="
				+ price + ", quantity=" + quantity + ", date=" + date + ", name=" + name + ", imagelink=" + imagelink
				+ ", totalprice=" + totalprice + "]";
	}
}
