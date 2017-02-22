package service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import restaurant.Users;

public class Loginservice
{
	static java.util.List list;
	public static Boolean loginService(Users user)
	{		
		//System.out.println(username + " " + password + "in login service");
		
		String username=user.getUsername();
		String password=user.getPassword();
		
		//validate
		 
		 Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");// populates the data of the
                                             // configuration file

         // creating session factory object
         SessionFactory factory = cfg.buildSessionFactory();

         // creating session object
         Session session = factory.openSession();

         // creating transaction object
         Transaction t = session.beginTransaction();

         Query query = session.createQuery("from Users where username=:u and password=:p");
         query.setParameter("u",username);
         query.setParameter("p",password);
         
         
         
         list=query.list();
         
         System.out.println(list);
         
         t.commit();
         session.close();
         
         if(list.toString()=="[]")
         {
        	 //System.out.println(list.get(0) + "is the user");
         return false;
         }
         else
        	 return true;
         
	}
}
