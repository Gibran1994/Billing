package com.billing.service;

import com.billing.dao.ItemDao;
import com.billing.dao.impl.ItemDaoImpl;
import com.billing.model.Item;

public class InsertItemService 
{


	public static void insertItemService(com.billing.pojo.Item item) {
		
		ItemDao itemDao = new ItemDaoImpl();
		Item itemModel = new Item();
		
		itemModel.setId(item.getItem_id());
		itemModel.setItem_name(item.getItem());
		itemModel.setRate(item.getPrice());
		
		
		itemDao.saveItem(itemModel);
		
	}
}
