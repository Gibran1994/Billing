package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//
//import com.restaurant.connect.CloseCon;
//import com.restaurant.connect.Connect;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Loginservice
{
	static java.util.List list;
	public static Boolean loginService(String username,String password)
	{
		
		System.out.println(username + " " + password);
		
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
         
         
         System.out.println(list);
         
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
