package com.foodbox.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.foodbox.model.DishesDetailsModel;

@Repository
public interface DishesDetails extends CrudRepository<DishesDetailsModel, Integer> {
	
	public Iterable<DishesDetailsModel> findAll();
	public void deleteById(int id);
	public DishesDetailsModel findById(int id);
	
}
