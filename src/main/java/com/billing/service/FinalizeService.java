package com.billing.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.restaurant.connect.CloseCon;
//import com.restaurant.connect.Connect;

public class FinalizeService
{
	public static double billamt;
	public static void setAmt(double total)
	{
		System.out.println("Bill Amount Assigned!");
		billamt=total;
	}
	public static double getAmt()
	{
		System.out.println("Bill amount returned");
		return billamt;
	}
	
	
	public static void finalizeService(String custName)
	{
		double total=0;

		String queryGetAll="Select Rate from com.billing.model.items where Item=?";
		
		String insertCustomer="Insert into com.billing.model.bill values(?,?)";
		
		String cal="Select * from com.billing.model.calc";
		
		String clearTable="Delete from com.billing.model.calc";
		Connection con=null;
		PreparedStatement ps=null;
		 try
		 {
			 con=Connect.getConnect();
			 ps=con.prepareStatement(cal);
			 ResultSet rs=ps.executeQuery();
			 System.out.println("Executed1");
			 ResultSet rs1;
			 while(rs.next())
			 {
				 int price=0;
				 String name=rs.getString("Item Name");
				 int qty=rs.getInt("Quantity");
				 
				 ps=con.prepareStatement(queryGetAll);
				 ps.setString(1, name);
				 rs1=ps.executeQuery();
				 System.out.println("Executed2");
				 
				 if(rs1.next())
				 {
					 price=rs1.getInt("Rate");
				 }
				 total=total+(qty*price);
			 }
			 ps=con.prepareStatement(insertCustomer);
			 ps.setString(1, custName);
			 ps.setDouble(2, total);
			 ps.executeUpdate();
			 System.out.println("Executed3");
			 
			 setAmt(total);
			 
			 
			 ps=con.prepareStatement(clearTable);
			 ps.executeUpdate();
			 System.out.println("Executed4");
			 
			// resp.sendRedirect("TotalBill.html");
			 
		 }
		 catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		 finally
		 {
			 try {
				CloseCon.close(con,ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }

	}
}
