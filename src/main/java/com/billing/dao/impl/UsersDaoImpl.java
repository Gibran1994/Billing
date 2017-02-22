package com.billing.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.billing.dao.UsersDao;
import com.billing.model.Users;

public class UsersDaoImpl implements UsersDao {

	public List<Users> fetchUserByUserNamePassword(String username,String password) {
		
		 Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");
         SessionFactory factory = cfg.buildSessionFactory();
        
         Session session = factory.openSession();
         Query query = session.createQuery("from Users where username=:u and password=:p");
         query.setParameter("u",username);
         query.setParameter("p",password);
                 
         List<Users> usersList = query.list();
         session.close();
         
		 return usersList;
	}

}
