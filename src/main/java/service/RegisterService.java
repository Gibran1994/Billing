package service;

import org.hibernate.Session;
//import restaurant.HibernateUtil;
import restaurant.Users;

public class RegisterService
{
	public static void registerService(Users user)
	{
		
		System.out.println("Inside Register Service");

		   Session session = restaurant.HibernateUtil.getSessionFactory().openSession();
		   session.beginTransaction();
		   System.out.println("session created");
		   
		
	        System.out.println(user.getUsername()+ " Registered");
	 
	        session.save(user);
	        session.getTransaction().commit();
	        session.close();
	        
	}
}
