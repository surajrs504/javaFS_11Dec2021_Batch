package com.foodbox.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;


import com.foodbox.model.UserdetailsModel;

@Repository
public interface UserRepo extends CrudRepository<UserdetailsModel, Integer> {

	public UserdetailsModel findByEmailidAndPassword(String emailid, String password);
	
	public UserdetailsModel findByUsername(String username);
}
