package com.example.soap.webservices.soapcoursemanagement;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

//Enable Spring Web Services
@EnableWs
//Spring Configuration

@Configuration
public class WebServiceConfig {
	//MesssageDispatcherServlet
	//ApplicationContext
	
	
	@Bean
	ServletRegistrationBean messageDispatcherServlet(ApplicationContext context)
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(messageDispatcherServlet, "/ws/*");
		
}
