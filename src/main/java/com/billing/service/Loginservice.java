package com.billing.service;

import java.util.List;

import javax.ws.rs.core.Response;

import com.billing.dao.UsersDao;
import com.billing.dao.impl.UsersDaoImpl;
import com.billing.model.Users;
import com.billing.pojo.User;

public class Loginservice
{
	
	public static Response loginService(User user)
	{		
	
		UsersDao usersDao = new UsersDaoImpl();
		List<Users> usersList = usersDao.fetchUserByUserNamePassword(user.getUsername(),user.getPassword());
		        
         if(usersList.isEmpty()){
        	 return Response.status(401).entity(false).build();
         }else{
        	 return Response.status(200).entity(false).build();
         }
        
         
	}
}
