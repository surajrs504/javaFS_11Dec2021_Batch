package com.foodbox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DishesDetailsModel {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public int id;
	public String dishname;
	public String dishdesc;
	public int dishprice;
	public int qty=1;
	public int finalprice=qty*dishprice;
	
	public DishesDetailsModel() {
		super();
	}
	public DishesDetailsModel(int id, String dishname, String dishdesc, int dishprice) {
		super();
		this.id = id;
		this.dishname = dishname;
		this.dishdesc = dishdesc;
		this.dishprice = dishprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public String getDishdesc() {
		return dishdesc;
	}
	public void setDishdesc(String dishdesc) {
		this.dishdesc = dishdesc;
	}
	public int getDishprice() {
		return dishprice;
	}
	public void setDishprice(int dishprice) {
		this.dishprice = dishprice;
	}
	@Override
	public String toString() {
		return "DishesDetailsModel [id=" + id + ", dishname=" + dishname + ", dishdesc=" + dishdesc + ", dishprice="
				+ dishprice + "]";
	}
	
	
	
	
}
