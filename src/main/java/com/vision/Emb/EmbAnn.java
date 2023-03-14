package com.vision.Emb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbAnn {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
	      cfg.configure("com/vision/Emb/hibernate.cfg.xml");
	      SessionFactory factory=cfg.buildSessionFactory();
	      
	      Student stu=new Student();
	      stu.setId(2);
	      stu.setName("SH");
	      stu.setStd("10th");
	      
	      Address add=new Address();
	      add.setStreet("StreetNo2");
	      add.setState("MH");
	      add.setPincode(1000345);
	      
	      stu.setAdd(add);
	      
	      Session session=factory.openSession();
	      session.beginTransaction();
	      
	      session.save(stu);
	      
	      session.getTransaction().commit();
	      session.close();
	      factory.close();

	}

}
