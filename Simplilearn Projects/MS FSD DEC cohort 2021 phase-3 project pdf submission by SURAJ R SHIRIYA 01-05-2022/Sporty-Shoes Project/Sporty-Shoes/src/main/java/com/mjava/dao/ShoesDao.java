package com.mjava.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mjava.model.ShoesDataModel;
	 
	@Repository
	public interface ShoesDao extends CrudRepository<ShoesDataModel, Integer> {

		 
		    public Iterable<ShoesDataModel> findByCategory( int category);
		  
		 
		
		    public  ShoesDataModel  findShoesDataModelById(int seletedShoeId);
		  
		  
		  @Modifying
			 @Transactional
			 @Query("delete from ShoesDataModel where id=:id")
			 public int deleteProductwithId(@Param("id") int id);
			   
		  @Modifying
			 @Transactional
			 @Query("update ShoesDataModel   set category=:category, price=:price, name=:name, imagelink=:imagelink  where id=:id")
			 public int updateShoeProduct(@Param("category") int category, @Param("price") double price,
					 @Param("name") String name, @Param("imagelink") String imagelink,
					 @Param("id") int id);  
}


