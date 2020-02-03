package com.eatza.gateway.config;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/oauth2/**").permitAll()
		        .antMatchers("/**").authenticated().and()
				.cors().disable()
				.csrf().disable()
				.httpBasic().disable()
				.exceptionHandling()
					.authenticationEntryPoint(
						(request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED))
					.accessDeniedHandler(
						(request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED));
	}

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		resources
		.resourceId("gateway-service");
	}

}
