package com.virtusa.repository;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.virtusa.model.User;
@Repository
public class UserRepositoryImpl  implements IUserRepository{
	Transaction tx=null;
	
	//private static final String GET_ALL_USER="From User";
	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	//save user data in data base
	private static Logger log=LoggerFactory.getLogger(UserRepositoryImpl.class);
	public Integer saveUser(User user) {
		Session ses=sf.openSession();
		tx=ses.beginTransaction();
		
		Integer id=(Integer) ses.save(user);
		tx.commit();
		ses.close();
		return id;
		
	}
	
	//get all data form database
	 public List<User> getAllUsers() { 
		 Session ses=sf.openSession();
		 tx=ses.beginTransaction();
		 @SuppressWarnings("unchecked")
		List<User> user=(List<User>) ses.createQuery("From User").list();
		 
	 tx.commit();
	 ses.close();
	  return user; }

	@Override
	public void updateuser(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(Integer Id) {
		Session ses=sf.openSession();
	
		tx=ses.beginTransaction();
		User user=new User();
		
		  String hql = "delete from User where id= :id "; 
		  System.out.println(user.getId()); 
		  org.hibernate.Query query= ses.createQuery(hql);
		  query.setInteger("id", Id); 
		  int count=  query.executeUpdate(); 
		  System.out.println(count);
		 
		
		System.out.println("user is deleted");
		tx.commit();
		ses.close();
	}

	@Override
	public Optional<User> getOneUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<User> getAllUser(Pageable p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUserExist(Integer Id) {
		Session ses=sf.openSession();
		tx=ses.beginTransaction();
		User user = ses.get(User.class, Id);
		boolean result=ses.contains(user);
		System.out.println(result);
		log.info("result are"+result);
ses.close();
		tx.commit();
		return result;
		
		
		 
	}

	@Override
	public boolean isUserExistByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteUser(Object setId) {
		// TODO Auto-generated method stub
		
	}
	  
	// login for user
	public User findUserByEmailOrMobileNoOrUserName(String loginData) {
		User user = null;
		try (Session session = sf.openSession()) {

			Query hql = session.createQuery("from User where email =:loginData or phoneNumber =:loginData or firstName =:loginData");
			hql.setParameter("loginData", loginData);
			
			user = (User) hql.uniqueResult();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
		
	
	

	/*
	 * @Override public void updateuser(User u) { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void deleteUser(Integer Id) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 * 
	 * @Override public Optional<User> getOneUser(Integer id) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * 
	 * @Override public Page<User> getAllUser(Pageable p) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public boolean isUserExist(Integer Id) { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * @Override public boolean isUserExistByName(String name) { // TODO
	 * Auto-generated method stub return false; }
	 */
}
