package com.springapp.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springapp.beans.GenericResponse;
import com.springapp.beans.PaginationResponse;
import com.springapp.beans.persistant.User;
import com.springapp.services.dao.mapper.UserMapper;
import com.springapp.services.delegate.UserDelegate;

@Component
@Path("/user")
public class UserService {
	static final Logger log = LogManager.getLogger(HelloWorldService.class.getName());
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	UserDelegate userDelegate;
	
	@GET
	@Path("/")
	public GenericResponse<PaginationResponse<List<User>>> getAllUsers() {
		log.entry();
		GenericResponse<PaginationResponse<List<User>>> response = new GenericResponse<>();
		response.setBody(userDelegate.getAllUsers());
		return log.exit(response);
	}
}
