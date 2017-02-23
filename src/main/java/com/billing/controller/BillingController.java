package com.billing.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.billing.pojo.BillItemList;
import com.billing.service.GenerateBillService;

@Path("/bill")
public class BillingController
{
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public static Response loginJersey(BillItemList billItemList)
	{
	
		GenerateBillService.generateBillService(billItemList);
		
		return null;
		
				
	}
}