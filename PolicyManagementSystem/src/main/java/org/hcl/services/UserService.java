package org.hcl.services;

import org.hcl.entities.UserData;

public interface UserService {

	public void insert(UserData user);
	public boolean validate(String userId,String password);
	
	
}
