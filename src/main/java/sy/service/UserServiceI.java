package sy.service;

import sy.module.User;


public interface UserServiceI {

	public User getUserById(Long id);
	
	public int insert(User u);
	
	public User selectByEmail(String email);
	
}
