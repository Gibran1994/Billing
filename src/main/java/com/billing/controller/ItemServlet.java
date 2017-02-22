package com.billing.controller;



import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.billing.pojo.Item;
import com.billing.service.InsertItemService;

@Path("/item")
public class ItemServlet
{
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public static Response loginJersey(Item item)
	{
	
		InsertItemService.insertItemService(item);
		return Response.status(200).entity(item).build();
	}
	
	

}
