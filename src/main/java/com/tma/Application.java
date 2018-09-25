package com.tma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Spring Boot Main Application
 *
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) throws Exception {
//		SpringApplication.run(Application.class, args);
		
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		DispatcherServlet dispatcherServlet = (DispatcherServlet) ctx.getBean("dispatcherServlet");
		dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
	}
	
}
