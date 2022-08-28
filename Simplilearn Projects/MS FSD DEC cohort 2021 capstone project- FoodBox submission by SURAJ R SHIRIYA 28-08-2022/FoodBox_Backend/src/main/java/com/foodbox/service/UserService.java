package com.foodbox.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.foodbox.model.UserdetailsModel;

import com.foodbox.repo.UserRepo;

@Service
public class UserService implements UserDetailsService  {

	@Autowired
	private UserRepo ur;
	
//	@Autowired
//	private LoginUserRepo lur;
	
//	@Autowired
	private BCryptPasswordEncoder bc;
	
	public void saveme(UserdetailsModel udm) {
		System.out.println("this is model detatils "+udm);
		  this.ur.save(udm);
		  
	}
	
//	public UserDetails loginme(String username, String password) {
////		String lemailid=udmm.getEmailid();
////		String lpassword=udmm.getPassword();
////		UserdetailsModel u= this.ur.findByEmailidAndPassword( lemailid
////				, lpassword);
////		return u;
//		
//		UserdetailsModel u= this.ur.findByUsername( username);
//		
//		String uname=  u.getUsername();
//		String pwd =u.getPassword();
//		
//	uname=this.bc.encode(uname);
//	System.out.println("pass"+ uname);
//		
//	
//	if(username.equals("suraj")) {
//		System.out.println("hello");
//		
//		return new User("suraj","$2a$10$p7VkTH.pzFCLb77Lwhs.iuuKPccWD./1Hkt0o6rWnrUd.0jvftpBu", new ArrayList<>());
//	}
//	else
//	{
//		throw new UsernameNotFoundException("user not found ");
//	}
//	
//	}

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	//	UserDetails u= this.ur.findByUsername( username);
		
//		String uname=  u.getUsername();
//		String pwd =u.getPassword();
//		System.out.println(uname+"  djsidj "+pwd);
		
//		try {
//			System.out.println(username);
//		UserdetailsModel user =  this.ur.findByUsername(username);
//		
//		User.
//		
//		System.out.println(user);
//		return user;
//		}
//		catch(Exception e){
//		return null;
//				
		//}
			System.out.println("hello hi");
			UserdetailsModel u= this.ur.findByUsername(username);
		System.out.println(u);
			
		
			if(u!=null) {
				String upwd = u.getPassword();
				String uname= u.getUsername();
			return new User(uname,upwd, new ArrayList<>());
			}
			else {
				throw new UsernameNotFoundException("username not found");
				
			}
		
	}
	
	public UserdetailsModel getalll(String username) {
		
		System.out.println("this is "+username +"username");
		UserdetailsModel u =this.ur.findByUsername(username);
		System.out.println(u+"helllo service");
		
		return u  ;
	}
}
