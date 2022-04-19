package com.virtusa.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.virtusa.model.Item;
@Repository
public class ICartRepositoryImpl implements ICartRepository {
	Transaction tx = null;
	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session ses=null;

	@Override
	public Integer saveCartItem(Item item) {
		ses = sf.openSession();
		tx=ses.beginTransaction();
		Integer id=(Integer) ses.save(item);
		System.out.println("product"+"id is saved in cart");
		tx.commit();
		ses.close();
		return id;
	}

	@Override
	public List<Item> getAllCartItem() {
		ses = sf.openSession();
		tx=ses.beginTransaction();
		List<Item> item=ses.createQuery("From Item").list();
		tx.commit();
		ses.close();
		return item;
	}

	
}
