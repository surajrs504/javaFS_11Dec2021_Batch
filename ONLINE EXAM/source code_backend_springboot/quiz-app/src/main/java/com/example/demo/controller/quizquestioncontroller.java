package com.example.demo.controller;

import java.util.List;

import java.util.Optional;

import javax.persistence.Access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.quizinfo;
import com.example.demo.model.quizquestion;
import com.example.demo.service.quizquestionservice;

@CrossOrigin(origins = "http://localhost:4200/")


@RestController
@RequestMapping("/questions")
public class quizquestioncontroller {
	

	@Autowired
	private quizquestionservice qqs;
	@PostMapping("/save")
	public quizquestion add(@RequestBody quizquestion qq)
	{
		return this.qqs.save(qq);
	}
	
	@GetMapping("/all")
	public List<quizquestion> findall(){
		return this.qqs.findall();
	}
	
//	@PostMapping("/findbyid")
//	public List<quizquestion> findbyqiid(@RequestBody quizinfo qui){
//		return this.qqs.findbyqid(qui);
//	}
	@GetMapping("/findbyid/{qui}")
	public List<quizquestion> findbyqiid(@PathVariable("qui") Long qui){
		return this.qqs.findbyqid(qui);
	}
	
	@GetMapping("/delbyid/{qui}")
	public void deletebyid(@PathVariable("qui") Long qui){
		 this.qqs.delbyid(qui);
	}
	
	
	
}
