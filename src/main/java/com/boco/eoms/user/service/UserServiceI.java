package com.boco.eoms.user.service;

import com.boco.eoms.user.module.User;


public interface UserServiceI {

	public User getUserById(Long id);
	
	public int insert(User u);
	
	public User selectByEmail(String email);
	
}
