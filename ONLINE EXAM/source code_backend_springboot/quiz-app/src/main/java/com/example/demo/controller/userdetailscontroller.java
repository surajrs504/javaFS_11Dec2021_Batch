package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.trackid;
import com.example.demo.model.userdetails;
import com.example.demo.repo.userdetailsrepo;
import com.example.demo.service.userdetailsservice;


@CrossOrigin(origins = "http://localhost:4200/")

@RestController
@RequestMapping("/user")
public class userdetailscontroller {
	
	
	@Autowired
	private userdetailsservice uds;
	
	@Autowired
	private userdetailsrepo udr;
	
	@GetMapping("/users")
	public  List<userdetails>  getAlluser(){
			
				return  udr.findAll();
			
	}
//	@GetMapping("/user")
//	public userdetails user() {
//		userdetails ud= new userdetails();
//		
//		
//		ud.setFirstname("jsdjd");
//		ud.setEmailid("dsdsd");
//		ud.setLastname("dsdsd");
//		ud.setPassword("dsdsds");
//		ud.setUsername("sdsdsdd");
//		ud.setPhnnumber(2332);
//		ud.setRegnumber(327837);
//		return udr.save(ud);
//	}
	
	@PostMapping("/adduser")
	public userdetails createuser(@RequestBody userdetails usd) {
		System.out.println(usd);
		return  udr.save(usd);
	}
	@PostMapping("/login")
	public userdetails login(@RequestBody userdetails ld) {
		System.out.println("in controller");
		
				userdetails str=uds.loginservice(ld);
				System.out.println("in controller"+str);
				return str;
	}

	@PostMapping("/adminprofile")
		public userdetails adminprof(@RequestBody trackid aide) {
		System.out.println("this is "+ aide);
		int aid=aide.getId();
			userdetails admdetails=uds.admindet(aid);
			System.out.println("this is admin"+admdetails);
			return admdetails;
		}
	}

