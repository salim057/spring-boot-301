/**
 * 
 */
package com.eatza.order.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Salim
 *
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	    auth.inMemoryAuthentication()
	    	.withUser("user").password("password").roles("USER")
	    	.and()
	    	.withUser("admin").password("admin").roles("ADMIN");
	}
	 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.httpBasic().disable().authorizeRequests()
	      .antMatchers("/order").permitAll()
	      .antMatchers("/order/*").hasAnyRole("USER", "ADMIN")
	      .anyRequest().authenticated()
	      .and()
	      .csrf().disable();
	}

}
