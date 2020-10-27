package org.hcl.services;

import javax.transaction.Transactional;

import org.hcl.dao.PolicyDao;

import org.hcl.entities.PolicyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class PolicyServiceImpl implements PolicyService {


	@Autowired
	PolicyDao policydao;
	
	@Override
	public boolean insert(PolicyData policy) {
		boolean status=policydao.insert(policy);
		return status;
	}

	@Override
	public PolicyData get(Integer policyId) {
		PolicyData policydata=policydao.get(policyId);
		return policydata;
	}

	@Override
	public void edit(PolicyData policy) {
		policydao.edit(policy);
		
	}

}
