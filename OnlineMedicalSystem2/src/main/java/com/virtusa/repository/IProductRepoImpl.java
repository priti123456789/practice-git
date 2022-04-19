package com.virtusa.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.virtusa.exception.ProductNotFoundException;
import com.virtusa.model.Product;

@Repository
public class IProductRepoImpl implements IProductRepository {
	Transaction tx = null;
	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session ses=null;
	private static Logger log=LoggerFactory.getLogger(IProductRepoImpl.class);
	@Override
	public Integer saveProduct(Product product) {
		ses = sf.openSession();
		tx = ses.beginTransaction();

		Integer id = (Integer) ses.save(product);
		if (id!=null) {
			tx.commit();
			log.info("product saved");
			System.out.println("product saved");
		} else {
			tx.rollback();
			log.error("product not saved");
			System.out.println("product not saved");
		}
		
		//tx.commit();
		ses.close();
		return id;

	}

	@Override
	public List<Product> getAllProduct() {
		ses = sf.openSession();
		tx = ses.beginTransaction();
		log.info("fetching all record from database");
		 List<Product> product=(List<Product>) ses.createQuery("From Product").list();
		 
	 tx.commit();
	 ses.close();
	  return  product;
	  }

	@Override
	public Product getProductById(Integer id) {
		ses = sf.openSession();
		tx = ses.beginTransaction();
		Product  prod;
		try {
	  prod=	ses.get(Product.class,id);
	log.info(prod.toString());
	System.out.println("product are"+prod);
		}
		catch(Exception e) {
			throw new ProductNotFoundException("Product not found for this id");
		}
		
	tx.commit();
		ses.close();
		
		return prod;
	}
// delete product
	@Override
	public void deleteProduct(Integer id) {
		ses = sf.openSession();
		tx = ses.beginTransaction();
		Product prod=ses.get(Product.class, id);
		ses.delete(prod);
		log.info("prod"+id +"deleted successfully");
		tx.commit();
		ses.close();
	}
		
	
	}


