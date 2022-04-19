package com.virtusa.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf=null; 
	static  {  
		if(sf==null) 
		sf=new Configuration().configure().buildSessionFactory(); 
		
		
	} 
	public static SessionFactory getSf() 
	 {  
		
		return sf;  
		}
	


} 