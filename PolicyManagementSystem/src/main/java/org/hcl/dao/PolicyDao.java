package org.hcl.dao;

import org.hcl.entities.PolicyData;

public interface PolicyDao {

	public boolean insert(PolicyData policy);
	public PolicyData get(Integer PolicyId);
	public void edit(PolicyData policy);
	
}
