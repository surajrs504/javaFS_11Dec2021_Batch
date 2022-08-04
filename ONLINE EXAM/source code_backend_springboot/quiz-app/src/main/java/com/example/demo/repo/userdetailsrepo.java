package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.userdetails;
@Repository 
public interface userdetailsrepo extends JpaRepository<userdetails, Integer> {
	public List<userdetails> findAll();
	
	public userdetails findByUsernameAndPassword(String username, String password);
	
	public Optional<userdetails> findByid(int id);
}
