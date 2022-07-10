package com.example.demo.repo;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.quizcategory;
@Repository
public interface quizcategoryrepo extends JpaRepository<quizcategory, Long> {

	public quizcategory save(quizcategory c);
	
	public List<quizcategory> findAll();
	
	public Optional<quizcategory> findById(Long id);
	
	public  void deleteById(Long id);
	
}
