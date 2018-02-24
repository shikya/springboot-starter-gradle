package com.springapp.services.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CORSFilter implements ContainerResponseFilter{
	private static final Logger log = LogManager.getLogger(CORSFilter.class.getName());

	@Override
	public void filter(ContainerRequestContext request, ContainerResponseContext response) throws IOException {
		log.entry();
		response.getHeaders().add("Access-Control-Allow-Origin", "*");
		response.getHeaders().add("Access-Control-Allow-Headers", "Content-Type, Authorization");
		response.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		log.exit(response);
	}

}
