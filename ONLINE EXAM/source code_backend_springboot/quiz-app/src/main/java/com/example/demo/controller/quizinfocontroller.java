package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

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
import com.example.demo.service.quizinfoservice;
import com.example.demo.service.quizquestionservice;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/quizinfo")
public class quizinfocontroller {
	
	@Autowired
	private quizinfoservice qis;
	
	@Autowired
	private quizquestionservice qqs;
	@PostMapping("/add")
	public quizinfo add (@RequestBody quizinfo in) {
		return this.qis.addinfo(in);
	}
	
	@GetMapping("/findall")
	public List<quizinfo> all(){
		return this.qis.findall();
	}
	
	@PostMapping("/del")
	public void delete(@RequestBody Long qid) {
		System.out.println("this is inside quizinfodelete"+qid);
		this.qis.delete(qid);
	}
	
	@PostMapping("/getbyid/{findid}")
	public Optional<quizinfo> findbyid(@PathVariable("findid") Long findid) {
		return this.qis.getbyid(findid);
	}
	
	
}
