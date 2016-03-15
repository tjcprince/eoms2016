package com.boco.eoms.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boco.eoms.user.dao.UserMapper;
import com.boco.eoms.user.module.User;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public User getUserById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(User u) {
		return userMapper.insert(u);
	}

	@Override
	public User selectByEmail(String email) {
		
		return userMapper.selectByEmail(email);
	}

}
