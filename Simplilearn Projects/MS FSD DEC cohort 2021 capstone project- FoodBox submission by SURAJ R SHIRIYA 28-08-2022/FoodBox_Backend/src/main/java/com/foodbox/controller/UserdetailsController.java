package com.foodbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.foodbox.model.UserdetailsModel;
import com.foodbox.repo.UserRepo;
import com.foodbox.security.JWTAuthRequest;
import com.foodbox.security.JWTAuthResponse;
import com.foodbox.security.JWTTokenHelper;
import com.foodbox.service.UserService;

//@CrossOrigin(origins="http://localhost:4200/" )
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin",origins = {"http://localhost:4200/"},maxAge = 4800, allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/auth/")
public class UserdetailsController {

	@Autowired
	private JWTTokenHelper jth;

	@Autowired
	private  UserDetailsService uds;
	
	@Autowired
	private AuthenticationManager am;
	
	@Autowired
	private UserRepo ur;
	
	@Autowired
	private UserService us;
	
	@Autowired
	private BCryptPasswordEncoder bc;
	
	@PostMapping("/adduser")
	public void createuser(@RequestBody UserdetailsModel usd) {
		
		System.out.println("add user method"+usd);
		
		usd.setPassword(this.bc.encode(usd.getPassword()));
		 this.us.saveme(usd);
	
	}
	
	@PostMapping("/login")
	
	public ResponseEntity<JWTAuthResponse> loginuser(@RequestBody JWTAuthRequest usd) throws Exception {
		
		System.out.println("hshjdfhs");
this.authenticate(usd.getUsername(),usd.getPassword());
		
		UserDetails ud= this.uds.loadUserByUsername(usd.getUsername());
		System.out.println("controller ud"+ud);
		String tok=this.jth.generateToken(ud);
		System.out.println("controller token"+tok);
		
		JWTAuthResponse jar= new JWTAuthResponse();
		jar.setToken(tok);
		return new ResponseEntity<JWTAuthResponse>(jar, HttpStatus.OK);
		
		
		
		//		System.out.println(usd);
		
//		return this.us.loginme(usd);
	
	}
	
	private void authenticate(String username, String password) throws Exception {
		System.out.println("hshjdfhs");
		UsernamePasswordAuthenticationToken authenticationToken=new UsernamePasswordAuthenticationToken(username, password);
		System.out.println("helooheey w"+authenticationToken.getCredentials());
		try{
			this.am.authenticate(authenticationToken);
		}
		catch (BadCredentialsException e) {
			System.out.println("Invalid Detials !!");
			throw new Exception("invalid username or password");
			
		}
	
		System.out.println("helllo");
		
		}
//	@CrossOrigin(origins="http://localhost:4200" )
	@PostMapping("/getall")
	public UserdetailsModel getalldetails(@RequestBody UserdetailsModel user) {
		String pass= user.getUsername();
		System.out.println("this is get all method");
		UserdetailsModel u = this.us.getalll(pass);
		System.out.println(u+"helllo");
		return u;
	}
	

	
	
}
