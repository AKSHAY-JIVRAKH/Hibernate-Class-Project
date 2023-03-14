package com.vision.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mapping {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	     cfg.configure("com/vision/cascading/hibernate.cfg.xml");
	     SessionFactory factory=cfg.buildSessionFactory();
	     
	     
	     Standard_11th stu= new Standard_11th();
	     stu.setRollNo(1);
	     stu.setName("Ak");
	     stu.setAge(26); 
	    
	     
	     Standard_11th stu1= new Standard_11th();
	     stu1.setRollNo(2);
	     stu1.setName("AKKK");
	     stu1.setAge(25);
	     
	     Standard_11th stu2= new Standard_11th();
	     stu2.setRollNo(3);
	     stu2.setName("Ajay");
	     stu2.setAge(26);
	     
	     City1 c=new City1();
	     c.setCid(101);
	     c.setCity("Mumbai");
	     
	     
	     stu.setCity(c);
	     stu1.setCity(c);
	     stu2.setCity(c);
	     
	     List<Standard_11th> list= new ArrayList();
	     list.add(stu);
	     list.add(stu1);
	     list.add(stu2);
	     
	     c.setStd(list);   
	     
	      Session session=factory.openSession();
	      session.beginTransaction();
	      
	      session.save(c);
//	      session.save(stu);
//	      session.save(stu1);
//	      session.save(stu2);
	      
	      System.out.println("session save object");
	      session.getTransaction().commit();
	      session.close();
	      factory.close();

	}

}
