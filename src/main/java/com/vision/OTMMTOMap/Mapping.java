package com.vision.OTMMTOMap;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mapping {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	     cfg.configure("com/vision/OTMMTOMap/hibernate.cfg.xml");
	     SessionFactory factory=cfg.buildSessionFactory();
	     
	     
	     Standard_10th stu= new Standard_10th();
	     stu.setRollNo(3);
	     stu.setName("Ak");
	     stu.setAge(26); 
	    
	     
	     Standard_10th stu1= new Standard_10th();
	     stu1.setRollNo(4);
	     stu1.setName("AKKK");
	     stu1.setAge(25);
	     
	     City c=new City();
	     c.setCid(102);
	     c.setCity("Mumbai");
	     
	     
	     stu.setCity(c);
	     stu1.setCity(c);
	     
	     List<Standard_10th> list= new ArrayList();
	     list.add(stu);
	     list.add(stu1);
	     
	     c.setStd(list);   
	     
	      Session session=factory.openSession();
	      session.beginTransaction();
	      
	      session.save(c);
	      session.save(stu);
	      session.save(stu1);
	      
	      System.out.println("session save object");
	      session.getTransaction().commit();
	      session.close();
	      factory.close();

	}

}
