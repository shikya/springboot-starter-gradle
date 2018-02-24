package com.springapp.services.delegate;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springapp.beans.PaginationResponse;
import com.springapp.beans.persistant.User;
import com.springapp.services.HelloWorldService;
import com.springapp.services.dao.mapper.UserMapper;

@Component
public class UserDelegate {
	static final Logger log = LogManager.getLogger(HelloWorldService.class.getName());
	
	@Autowired()
	UserMapper userMapper;
	
	public PaginationResponse<List<User>> getAllUsers(){
		PaginationResponse<List<User>> pages = new PaginationResponse<>();
		pages.setTotalSize(userMapper.getAllCount());
		pages.setData(userMapper.getAll());
		pages.setSizePerPage(10);
		pages.setTotalPages(pages.getTotalSize() / pages.getSizePerPage());
		return pages;
	}
}
