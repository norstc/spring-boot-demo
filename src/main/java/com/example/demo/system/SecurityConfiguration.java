package com.example.demo.system;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests().antMatchers("/").permitAll().and()
		.authorizeRequests().antMatchers("/console/**").permitAll();
		
		//h2console setting
		httpSecurity.csrf().disable();
		httpSecurity.headers().frameOptions().disable();
	}
}
