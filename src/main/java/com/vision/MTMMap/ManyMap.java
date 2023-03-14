package com.vision.MTMMap;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyMap {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
	    cfg.configure("com/vision/MTMMap/hibernate.cfg.xml");
	    SessionFactory factory=cfg.buildSessionFactory();

	    Employeee e=new Employeee();
	    Employeee e1=new Employeee();
	    
	    e.setEid(1);
	    e.setEname("Akshay");
	    
	    e1.setEid(2);
	    e1.setEname("Ajay");
	    
	    
	    Project p=new Project();
	    Project p1=new Project();
	    
	    p.setPid(101);
	    p.setPname("DuluxB2B");
	    
	    p1.setPid(102);
	    p1.setPname("ENAM");
	    
	    List<Employeee> list1=new ArrayList<Employeee>();
	    List<Project> list2=new ArrayList<Project>();
	    
	    list1.add(e);
	    list1.add(e1);
	    
	    list2.add(p);
	    list2.add(p1);
	    
	    e.setProjects(list2);
	    e1.setProjects(list2);
	    
	    p.setEmployees(list1);

	    Session session=factory.openSession();
	    session.beginTransaction();
	      
	    session.save(e);
	    session.save(e1);
	    session.save(p);
	    session.save(p1);
	    
	    System.out.println("session save object");
	    session.getTransaction().commit();
	  
	    session.close();
	    factory.close();
	            
	}
}
