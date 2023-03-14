package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mapping {

	public static void main(String[] args) {
	      Configuration cfg = new Configuration();
	      cfg.configure("com/mapping/xml/hibernate.cfg.xml");
	      SessionFactory factory=cfg.buildSessionFactory();
	      
	      Books book=new Books();
	      book.setAutId(103);
          book.setAutName("Ajay");
          book.setAutBook("ABC");
          book.setAutCity("pune");
	      
	      Books book1=new Books();
	      book1.setAutId(104);
          book1.setAutName("Ashwin");
          book1.setAutBook("XYZ");
          book1.setAutCity("Mumbai");
	      
	      Session session=factory.openSession();
	      
	      session.beginTransaction();
	      
	      session.save(book);
	      session.save(book1);
	      
	      session.getTransaction().commit();
	      
	      session.close();
          factory.close();
	}

}
