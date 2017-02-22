package com.billing.dao.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.billing.dao.ItemDao;

import com.billing.model.Item;

public class ItemDaoImpl implements ItemDao{

	public Item saveItem(Item item) {

		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
       
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(item);
        tx.commit();       
       
        return item;
	}

}
