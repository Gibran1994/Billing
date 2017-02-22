package com.jersey;

import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import restaurant.Users;
import service.Loginservice;

@Path("/login")
public class LoginServlet
{

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public static Response loginJersey(Users user)
	{
		
		System.out.println("trying to log in as " + user.getUsername());
		Boolean res=Loginservice.loginService(user);
				
		java.net.URI location;
		if(res)
		{
		try {
			location = new java.net.URI("../WelcomeUser.html");
			return Response.temporaryRedirect(location).build();

			} catch (URISyntaxException e) {
			e.printStackTrace();
			
			}
		}
		else
		{
			try {
				location = new java.net.URI("../InvalidUser.html");
				return Response.temporaryRedirect(location).build();

				} catch (URISyntaxException e) {
				e.printStackTrace();
				}
		}
		return null;
	    }
}