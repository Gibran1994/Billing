package com.billing.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.billing.pojo.User;
import com.billing.service.Loginservice;

@Path("/login")
public class LoginController
{

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public static Response loginJersey(User user)
	{		
		System.out.println("trying to log in as " + user.getUsername());
		return Loginservice.loginService(user);
		
	}	
}