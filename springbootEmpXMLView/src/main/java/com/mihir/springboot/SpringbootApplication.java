package com.mihir.springboot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

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

