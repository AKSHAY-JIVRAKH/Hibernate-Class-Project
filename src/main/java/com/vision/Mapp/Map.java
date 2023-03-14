package com.vision.Mapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Map {

	public static void main(String[] args) {
		 System.out.println("Project start");
		Configuration cfg = new Configuration();
	      cfg.configure("com/vision/Mapp/hibernate.cfg.xml");
	      SessionFactory factory=cfg.buildSessionFactory();

	      System.out.println("std class object");
	      
	      Standard_9th std=new Standard_9th();
	      std.setRollNo(1);
	      std.setName("Ak");
	      std.setAge(25);
	      
	      System.out.println("city class object");
	      
	      City c=new City();
	      c.setCid(101);
	      c.setCity("pune");
	      c.setStd(std);
	      
	      std.setCity(c);

	      Session session=factory.openSession();
	      session.beginTransaction();
	      
	      session.save(std);
	      session.save(c);
	      
	      System.out.println("session save object");
	      session.getTransaction().commit();
	      session.close();
	      factory.close();
	            
	}

}
