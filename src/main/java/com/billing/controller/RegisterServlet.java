package com.billing.controller;

import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.hibernate.Session;

import com.billing.model.Users;

@Path("register")
public class RegisterServlet
{

	
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public static Response loginJersey(Users user)
		{
		System.out.println("Trying to register " + user.getUsername());
		System.out.println("i am in branch 1.0.1");
		Session session = com.billing.model.HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		   System.out.println("session created");
		   
	        session.save(user);
	        session.getTransaction().commit();
	        session.close();
	        
	        System.out.println(user.getUsername()+ " Registered");
		
		try {
			System.out.println("Trying to redirect");
			java.net.URI location;
			location = new java.net.URI("../login.html");
			return Response.temporaryRedirect(location).build();

			} catch (URISyntaxException e) {
			e.printStackTrace();
			
			}
		return null;
			
	}
}