package com.nokia.app.school_admin_demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter{

    @Override
    public void configure(final HttpSecurity http) throws Exception{
        http.authorizeRequests()
        .antMatchers("/actuator/health",
        "/swagger-ui.html",
        "/swagger-resources/**",
        "/v2/**",
        "/webjars/**")
        .permitAll();
    }
    
}