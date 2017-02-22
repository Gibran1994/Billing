package com.billing.service;

import org.hibernate.Session;

import com.billing.model.Users;

public class RegisterService
{
	public static void registerService(Users user)
	{
		
		System.out.println("Inside Register Service");

		   Session session = com.billing.model.HibernateUtil.getSessionFactory().openSession();
		   session.beginTransaction();
		   System.out.println("session created");
		   
		
	        System.out.println(user.getUsername()+ " Registered");
	 
	        session.save(user);
	        session.getTransaction().commit();
	        session.close();
	        
	}
}
