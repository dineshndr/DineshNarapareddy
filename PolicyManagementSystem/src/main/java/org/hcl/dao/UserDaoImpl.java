package org.hcl.dao;

import org.hcl.entities.PolicyData;
import org.hcl.entities.UserData;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory factory;

	@Override
	public void insert(UserData user) {
		Session session = factory.openSession();
		session.save(user);

	}

	@Override
	public boolean validate(String userId, String password) {
		Session session=factory.getCurrentSession();
		Criteria criteria = session.createCriteria(UserData.class);
		criteria.add(Restrictions.like("userId",userId));
		boolean flag=false;
		Object result = criteria.uniqueResult();
        if(result!=null) {
        	UserData user=(UserData)result;
        	if(user.getPassword().equalsIgnoreCase(password)) {
        		flag=true;
        	}
        	else {
        		flag=false;
        	}
        }
		return flag;
	}

	@Override
	public PolicyData getPolicy(int policyid) {
		Session session=factory.openSession();
			
		String sql = "from org.hcl.entities.PolicyData p where policyId=:pid";
		PolicyData pd = (PolicyData) session.createQuery(sql).setParameter("pid",policyid).uniqueResult();
		return pd;
	}


}
