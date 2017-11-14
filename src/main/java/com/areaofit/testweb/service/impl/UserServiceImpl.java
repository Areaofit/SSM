package com.areaofit.testweb.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.areaofit.testweb.dao.UserDao;
import com.areaofit.testweb.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	public UserDao userDao;

	@Override
	public Map<String, Object> getUserById(String id) {
		return userDao.getUserById(id);
	}

}
