package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.userdetails;
import com.example.demo.repo.userdetailsrepo;

@Component
public class userdetailsservice {

		@Autowired
	private userdetailsrepo ud;
//	public List<userdetails> ud()
//	{
//		List<userdetails> list=(List<userdetails>) this.ud.findAll();
//		return list;
//	}
		
		
	
		public userdetails loginservice(userdetails wld) {
			String usrweb= wld.getUsername();
			String pwdweb=wld.getPassword();
			try {
			userdetails sld=this.ud.findByUsernameAndPassword(usrweb,pwdweb);
			if(wld.getUsername().equals(sld.getUsername()) && wld.getPassword().equals(wld.getPassword())) {
				return sld;     
				
			}
			else {
				return null;
			}
			}
			catch(Exception e){
				return null;
			}
			
		}
		
		public userdetails admindet(int adid) {
		
			System.out.println("this is "+adid);
			Optional<userdetails> aud= this.ud.findByid(adid);
			userdetails uda=aud.get();
			System.out.println(uda);
			return uda;
		}
	
	
}
