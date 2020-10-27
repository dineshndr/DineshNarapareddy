package org.hcl.services;

import javax.transaction.Transactional;

import org.hcl.dao.UserDao;
import org.hcl.entities.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;
	
	@Override
	public void insert(UserData user) {
		userdao.insert(user);
	}

	@Override
	public boolean validate(String userId, String password) {
		return userdao.validate(userId, password);
	}

}
