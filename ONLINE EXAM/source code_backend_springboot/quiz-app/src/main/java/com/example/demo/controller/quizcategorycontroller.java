package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.quizcategory;
import com.example.demo.repo.quizcategoryrepo;
import com.example.demo.service.quizcategoryservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@CrossOrigin(origins = "http://localhost:4200/")

@RestController
@RequestMapping("/category")
public class quizcategorycontroller {

	@Autowired
	private quizcategoryservice qcs;
	
	@Autowired
	private quizcategoryrepo qcr;
	
	@PostMapping("/add")
	public quizcategory addcat( @RequestBody quizcategory cat) {
	 return this.qcs.addcategory(cat);
	}
	
	@GetMapping("/all")
	public List<quizcategory> all(){
		return qcs.findall();
	}
	
	@PostMapping("/del")
	public void delete(@RequestBody quizcategory qc) {
		qcs.delete(qc);
	}
	
	@GetMapping("/findbyid/{findid}")
	public Optional<quizcategory> findid(@PathVariable("findid") Long findid){
		return qcs.findbyid(findid);
		}
}
