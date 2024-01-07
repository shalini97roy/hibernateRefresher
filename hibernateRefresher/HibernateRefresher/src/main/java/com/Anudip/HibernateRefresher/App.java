package com.Anudip.HibernateRefresher;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
    	
    	//First Session
    	Session s=sf.openSession() ;
    	s.beginTransaction() ;
    	
    	/*User u1=new User();
    	u1.setUserId(1);
    	u1.setUserName("Anisha");
    	u1.setAddress("Kolaghat");
    	u1.setSalary(45000);
    	s.save(u1);
    	
    	User u2=new User();
    	u2.setUserId(2);
    	u2.setUserName("Pradipta");
    	u2.setAddress("Kolkata");
    	u2.setSalary(55000);
    	s.save(u2);
    	
    	User u3=new User();
    	u3.setUserId(3);
    	u3.setUserName("Bristi");
    	u3.setAddress("Bandel");
    	u3.setSalary(40000);
    	s.save(u3);
        
    	s.getTransaction().commit();
    	System.out.println("Data saved successfully.....");*/
    	
    	
    	User ur1=s.get(User.class,1);
    	System.out.println(ur1);   //Fetching data using first session
    	s.close();
    	
    	//Second Session
    	Session s2=sf.openSession() ;
    	User ur2=s2.get(User.class,1);
    	System.out.println(ur2);         //Fetching data using second session
    	s.close();
    	
    	
    }
}
