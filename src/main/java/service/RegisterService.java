package service;

import org.hibernate.Session;
//import restaurant.HibernateUtil;
import restaurant.Users;

public class RegisterService
{
	public static void registerService(int id,String username,String password)
	{
		
		System.out.println("Inside Register Service");

		   Session session = restaurant.HibernateUtil.getSessionFactory().openSession();
		   
		   System.out.println("session created");
		   
	        session.beginTransaction();
	        Users user = new Users();
	        
	        user.setId(id);
	        user.setUsername(username);
	        user.setPassword(password);
	        
	        System.out.println(username + " Registered");
	 
	        session.save(user);
	        session.getTransaction().commit();
	        
	}
}
