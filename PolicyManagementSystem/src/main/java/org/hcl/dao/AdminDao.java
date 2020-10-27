package org.hcl.dao;

import org.hcl.entities.AdminCredentials;

public interface AdminDao {

	public void insert(AdminCredentials admin);
	public boolean validate(String vendorId,String password);
	
}
