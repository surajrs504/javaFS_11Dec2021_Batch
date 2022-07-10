package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.quizinfo;
import com.example.demo.repo.quizinforepo;

@Component
public class quizinfoservice {

	@Autowired
	private quizinforepo qir;
	
	public quizinfo addinfo(quizinfo qi) {
		quizinfo qqi= this.qir.save(qi);
		
		System.out.println(qqi);
		return qqi;
		 
	}
	
	public List<quizinfo> findall(){
		return this.qir.findAll();
		}
	
	public void delete(Long qinfo) {
		//Long did =qinfo.getQuizinfoid();
		this.qir.deleteById(qinfo);
	}
	public Optional<quizinfo> getbyid(Long qinfo){
	//	Long did =qinfo.getQid();
		return this.qir.findById(qinfo);
	}
}
