package com.foodbox.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.foodbox.service.UserService;

@Configuration
@EnableWebSecurity
@EnableWebMvc
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecutirtyConfig  extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserService ms;

	@Autowired
	private JWTAuthenticationEntryPoint jep;
	
	@Autowired
	private JWTAuthenticationFilter jf;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
			
		http.csrf().disable().authorizeRequests().antMatchers("/api/v1/auth/login",
				"/api/v1/auth/adduser","/admin/findall").permitAll().antMatchers(HttpMethod.OPTIONS).permitAll()
		
		
		.anyRequest().authenticated().and().exceptionHandling().authenticationEntryPoint(this.jep).
		and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
			
		http.addFilterBefore(this.jf, UsernamePasswordAuthenticationFilter.class);
	}

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
   	String encodedPassword = passwordEncoder.encode("hello");
   	System.out.println("original "+this.ms);
//    	
   	System.out.println("encoded  "+encodedPassword);
//		System.out.println("dhsdhsakdh  ");
		auth.userDetailsService(this.ms).passwordEncoder(pe());
	}

    @Bean
   public  BCryptPasswordEncoder pe() {
    	
        return new BCryptPasswordEncoder();
    }
	
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManagerBean();
	}
	
	 
	
}
