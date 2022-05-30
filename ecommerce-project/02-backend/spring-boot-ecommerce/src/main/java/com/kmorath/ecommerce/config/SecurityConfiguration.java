package com.kmorath.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.okta.spring.boot.oauth.Okta;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// protect endpoint /api/orders
		http.authorizeRequests()
				.antMatchers("/api/orders/**")
				.authenticated()
				.and()
				.oauth2ResourceServer()
				.jwt();
		
		// add support CORS filters
		http.cors();
		
		// force a nno-empty response body for 401's to make the response more friendly
		Okta.configureResourceServer401ResponseBody(http);
	}
}
