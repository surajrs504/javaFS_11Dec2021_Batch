package com.foodbox.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.foodbox.service.UserService;
@Component
public class JWTAuthenticationFilter extends OncePerRequestFilter{

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private UserService us;
	
	@Autowired
	private JWTTokenHelper jth;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		//1) get token
		String requestToken = request.getHeader("Authorization");
		System.out.println(requestToken);
		String username=null;
		String token =null;
		
		if(requestToken != null && requestToken.startsWith("Bearer")) {
			token = requestToken.substring(7);
			
			try {
				username=this.jth.getUsernameFromToken(token);
			}
			catch (Exception e) {
				System.out.println("unable to get jwt token ");
				// TODO: handle exception
			}
		}
		else {
			System.out.println("request token is null or doesnt start with bearer");
		}
		
		if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
			
			UserDetails ud= this.userDetailsService.loadUserByUsername(username);
			System.out.println("inside filter method");
			if(this.jth.validateToken(token, ud)) {
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken= new UsernamePasswordAuthenticationToken( ud,null, ud.getAuthorities() );
				usernamePasswordAuthenticationToken.setDetails(usernamePasswordAuthenticationToken);
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
				System.out.println("inside filter method if statement");
			}
			else {
				System.out.println("username is null or context is not null");
				
			}
			
		}
		filterChain.doFilter(request, response);
	}

	
}
