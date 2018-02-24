package com.springapp.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;


@Component
@Path("/hello")
public class HelloWorldService {
	static final Logger log = LogManager.getLogger(HelloWorldService.class.getName());

	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML)
	public String getHelloWorld() {
		log.entry();
		return log.exit("Hello World");
	}
}
