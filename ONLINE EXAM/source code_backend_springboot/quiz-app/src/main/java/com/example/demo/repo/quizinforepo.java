package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.quizinfo;

@Repository
public interface quizinforepo extends JpaRepository<quizinfo, Long>{

	public quizinfo save(quizinfo qi);
	
	
	public List<quizinfo> findAll();
	
	public void deleteById(Long id);
	
	public Optional<quizinfo> findById(Long id);
	
}
