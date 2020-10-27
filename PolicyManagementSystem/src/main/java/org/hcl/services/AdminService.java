package org.hcl.services;

import org.hcl.entities.AdminCredentials;

public interface AdminService {

	public void insert(AdminCredentials admin);
	public boolean validate(String vendorId,String password);
	
}
