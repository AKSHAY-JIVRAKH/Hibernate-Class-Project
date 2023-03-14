package com.vision.OTMMTOMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchMap {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	     cfg.configure("com/vision/OTMMTOMap/hibernate.cfg.xml");
	     SessionFactory factory=cfg.buildSessionFactory();
	     
	     Session session=factory.openSession();
	     
	     City c=(City)session.get(City.class, 101);
	     
	     System.out.println(c.getCid());
	     System.out.println(c.getCity());
	     
	     //System.out.println(c.getStd().size());

	}

}
