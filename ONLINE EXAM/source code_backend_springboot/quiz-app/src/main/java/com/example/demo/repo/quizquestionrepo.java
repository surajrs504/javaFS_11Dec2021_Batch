package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.quizinfo;
import com.example.demo.model.quizquestion;
@Repository
public interface quizquestionrepo extends JpaRepository<quizquestion, Long>{

	public quizquestion save(quizquestion qq);
	
	public List<quizquestion> findAll();
	
	public Optional<quizquestion> findById(Long id);
	
	public List<quizquestion> findByQi(quizinfo qi);
	public void deleteById(Long id);
	
	
}
