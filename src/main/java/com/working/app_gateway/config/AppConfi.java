package com.working.app_gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfi {
	   @Bean
	    public RestTemplate template(){
	       return new RestTemplate();
	    }

}
