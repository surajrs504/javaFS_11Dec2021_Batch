package com.foodbox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodbox.model.DishesDetailsModel;
import com.foodbox.service.DishesService;

@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin",origins = {"http://localhost:4200/"},maxAge = 4800, allowedHeaders = "*")
@RestController
@RequestMapping("/admin/")
public class FoodDetailsController {
	
	@Autowired
	private DishesService  ds;
	
	@GetMapping("/findall")
	public List<DishesDetailsModel> findall(){
		return this.ds.listall();
	}
	
	@PostMapping("/add")
	public boolean adddishes(@RequestBody DishesDetailsModel dd){
		return this.ds.add(dd);
	}

	@PostMapping("/del")
	public void delbyid(@RequestBody DishesDetailsModel ddm) {
		
		int id=ddm.getId();
		this.ds.del(id);
	}
	
	@PostMapping("/modify")
	public void modifydish(@RequestBody DishesDetailsModel ddm) {
		this.ds.modify(ddm);
	}
	
}
