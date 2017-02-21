package com.jersey;

import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import service.RegisterService;

@Path("/register")
public class RegisterServlet
{

		@POST
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		public static Response loginJersey(@FormParam ("id") int id,@FormParam("user") String username,@FormParam("password") String password)
		{
		System.out.println(id + " " +username + " " + password);
		
		
		
		RegisterService.registerService(id,username,password);
		
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