package com.springapp.services.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.springapp.services.HelloWorldService;
import com.springapp.services.UserService;

@ApplicationPath("/api")
@Configuration
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {
		// Register endpoints, providers, ...
		this.registerEndpoints();

	}
	
	private void registerEndpoints() {
		// Services
		register(HelloWorldService.class);
		register(UserService.class);
	}	
}
