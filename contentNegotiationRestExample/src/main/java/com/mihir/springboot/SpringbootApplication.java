package com.mihir.springboot;

import java.util.Arrays;

import javax.ws.rs.core.MediaType;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootApplication.class, args);
	String[] beanNames = ctx.getBeanDefinitionNames();
    
    Arrays.sort(beanNames);

    for (String beanName : beanNames) {
        System.out.println(beanName);
    }
   
   
		
	}

}

