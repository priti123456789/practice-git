package com.virtusa.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.virtusa.model.DealerProduct;



@Repository
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	Transaction tx=null;
	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
private static Logger log=LoggerFactory.getLogger(ProductDao.class);
	// create
	@Transactional
	public void createProduct(DealerProduct product) {
		Session ses=sf.openSession();
		tx=ses.beginTransaction();
		
		System.out.println("save product in database");
		//this.hibernateTemplate.save(product);
ses.saveOrUpdate(product);
		//this.hibernateTemplate.saveOrUpdate(product);
System.out.println("product save successfully");
tx.commit();
ses.close();
	}

	// get all products
	public List<DealerProduct> getProducts() {
		Session ses=sf.openSession();
		tx=ses.beginTransaction();
		 List<DealerProduct> products=(List<DealerProduct>) ses.createQuery("From DealerProduct").list();
		 
		 tx.commit();
		 ses.close();
		System.out.println("fetching all product from database");
		//List<DealerProduct> products = this.hibernateTemplate.loadAll(DealerProduct.class);
		return products;
	}
	

	// delete the single product
	@Transactional
	public void deleteProduct(int pid) {
		Session ses=sf.openSession();
		tx=ses.beginTransaction();
		
		DealerProduct prod=ses.get(DealerProduct.class, pid);
		//DealerProduct p = this.hibernateTemplate.load(DealerProduct.class, pid);
		//this.hibernateTemplate.delete(p);
		ses.delete(prod);
		System.out.println("product deleedsuccessfully");
		log.warn("Product Deleted successfully");
		tx.commit();
		ses.close();
	}

	// get the single product
	public DealerProduct getProduct(int pid) {
		return this.hibernateTemplate.get(DealerProduct.class, pid);
	}
}
