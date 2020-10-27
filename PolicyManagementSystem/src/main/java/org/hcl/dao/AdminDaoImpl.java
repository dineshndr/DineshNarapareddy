package org.hcl.dao;

import org.hcl.entities.AdminCredentials;
import org.hcl.entities.UserData;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	SessionFactory factory;
	
	
	@Override
	public void insert(AdminCredentials admin) {
		
		Session session= factory.openSession();
		session.save(admin);
		
	}


	@Override
	public boolean validate(String vendorId,String password) {
		Session session=factory.getCurrentSession();
		Criteria criteria = session.createCriteria(AdminCredentials.class);
		criteria.add(Restrictions.like("vendorId",vendorId));
		boolean flag=false;
		Object result = criteria.uniqueResult();
        if(result!=null) {
         AdminCredentials admin=(AdminCredentials)result;
        	if(admin.getPassword().equalsIgnoreCase(password)) {
        		flag=true;
        	}
        	else {
        		flag=false;
        	}
        }
		return flag;
	}

}
