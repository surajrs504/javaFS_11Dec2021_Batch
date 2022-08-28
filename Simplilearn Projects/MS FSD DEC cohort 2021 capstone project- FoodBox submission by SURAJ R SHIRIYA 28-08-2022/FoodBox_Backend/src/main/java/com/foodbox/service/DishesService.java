package com.foodbox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodbox.model.DishesDetailsModel;
import com.foodbox.repo.DishesDetails;

@Service
public class DishesService {

	@Autowired
	private DishesDetails dd;
	
	
	public boolean add(DishesDetailsModel dish) {
		System.out.println(dish);
		try{
			this.dd.save(dish);
			return true;
		}
		catch(Exception e){
			return  false;
		}
	}
	
	public List<DishesDetailsModel> listall(){
		List<DishesDetailsModel> hello=(List<DishesDetailsModel>) this.dd.findAll();
		System.out.println(hello);
		
		hello.forEach(System.out::println);
		return hello;
	}
	
	public void del( int id) {
		this.dd.deleteById(id);
	}
	
	public void modify(DishesDetailsModel ddm) {
		
		DishesDetailsModel dd=this.dd.findById(ddm.getId());
		
		dd.setDishdesc(ddm.getDishdesc());
		dd.setDishname(ddm.getDishname());
		dd.setDishprice(ddm.getDishprice());
		
		this.dd.save(dd);
	}
	
}
