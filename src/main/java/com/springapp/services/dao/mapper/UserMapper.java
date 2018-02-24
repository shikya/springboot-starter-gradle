package com.springapp.services.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.springapp.beans.persistant.User;

@Mapper
public interface UserMapper {

	@Select("SELECT COUNT(*) FROM users")
	public int getAllCount();

	@Select("SELECT * FROM users limit 0, 10")
	public List<User> getAll();
}
