package org.hcl.services;

import javax.transaction.Transactional;

import org.hcl.dao.AdminDao;

import org.hcl.entities.AdminCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class AdminServiceImpl implements AdminService {


	@Autowired
	AdminDao admindao;
	
	
	@Override
	public void insert(AdminCredentials admin) {
		admindao.insert(admin);
	}


	@Override
	public boolean validate(String vendorId, String password) {
		return admindao.validate(vendorId, password);
	}

}
