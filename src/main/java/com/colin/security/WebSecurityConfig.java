package com.colin.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import static com.colin.security.SecurityConstants.SIGN_UP_URL;
import static com.colin.security.SecurityConstants.HOME_URL;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
		.antMatchers(HttpMethod.GET, HOME_URL).permitAll()
		.antMatchers(HttpMethod.POST, SIGN_UP_URL).permitAll()
		.anyRequest().authenticated()
		;
	}
	

}
