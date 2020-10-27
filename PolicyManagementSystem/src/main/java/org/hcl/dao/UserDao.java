package org.hcl.dao;

import org.hcl.entities.PolicyData;
import org.hcl.entities.UserData;

public interface UserDao {
public void insert(UserData user);
public boolean validate(String username,String password);
public PolicyData getPolicy(int policyid);

}
