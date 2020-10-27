package org.hcl.services;

import org.hcl.entities.PolicyData;

public interface PolicyService {

	public boolean insert(PolicyData policy);
	public PolicyData get(Integer policyId);
	public void edit(PolicyData policy);
}
