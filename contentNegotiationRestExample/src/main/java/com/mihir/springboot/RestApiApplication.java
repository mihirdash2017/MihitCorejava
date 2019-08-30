package com.mihir.springboot;

import javax.ws.rs.core.MediaType;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
@EnableWebMvc
public class RestApiApplication extends WebMvcConfigurerAdapter {

@Override
public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {

   configurer.favorPathExtension(false).
   favorParameter(true).
   ignoreAcceptHeader(false);
 //  useJaf(false).
 //  defaultContentTypeStrategy("",MediaType.APPLICATION_XML).
  // mediaType("xml", MediaType.APPLICATION_XML).
 //  mediaType("json", MediaType.APPLICATION_JSON);
}
}
