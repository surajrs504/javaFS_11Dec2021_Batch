package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.quizinfo;
import com.example.demo.model.quizquestion;
import com.example.demo.repo.quizquestionrepo;

@Component
public class quizquestionservice {

	@Autowired
	private quizquestionrepo qqr;
	public quizquestion save(quizquestion qq) {
		quizquestion hol=this.qqr.save(qq);
		
		return hol;
	}
	
	public List<quizquestion> findall(){
		return this.qqr.findAll();
	}
	
	public  Optional<quizquestion> findbyid(quizquestion qq){
		Long did =qq.getQuestionid();
		return this.qqr.findById(did);
	}
	
	public List<quizquestion> findbyqid(Long quiz){
		quizinfo qi= new quizinfo();
		qi.setQuizinfoid(quiz);
		return this.qqr.findByQi(qi);
	}
	
	public void delbyid(Long id) {
		 this.qqr.deleteById(id);
	}
}
