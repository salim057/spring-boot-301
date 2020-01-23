package com.eatza.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Salim
 *
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().anyRequest().authenticated();
//	}

	@Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("password")
                .roles("USER")
                .and()
                .withUser("admin")
                .password("password")
                .roles("ADMIN");
    }

}