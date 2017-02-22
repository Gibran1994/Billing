package service;

import org.hibernate.Session;

import restaurant.Item;

public class InsertItemService 
{
	public static void insertItemService(int item_id,String itemName,int itemValue)
	{
		System.out.println("Inside Insert Item Service");
		
		Session session = restaurant.HibernateUtil.getSessionFactory().openSession();
		   
		System.out.println("session created");
		
		session.beginTransaction();
        Item item=new Item();
        item.setId(item_id);
        item.setItem(itemName);
        item.setRate(itemValue);
	}
}
