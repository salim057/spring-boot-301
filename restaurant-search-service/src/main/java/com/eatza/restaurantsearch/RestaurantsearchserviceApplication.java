package com.eatza.restaurantsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableCaching
public class RestaurantsearchserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantsearchserviceApplication.class, args);
	}

	
//	@Bean
//	public FilterRegistrationBean<JwtFilter> jwtFilter() {
//		final FilterRegistrationBean<JwtFilter> registrationBean = new FilterRegistrationBean<>();
//		registrationBean.setFilter(new JwtFilter());
//		registrationBean.addUrlPatterns("/restaurants/*","/items/");
//
//		return registrationBean;
//	}
}
