package com.vision.HqlPagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.vision.ProjectWithMaven.Employee;

public class HqlPagination {

	public static void main(String[] args) {
		  
	  Configuration cfg = new Configuration();
	  cfg.configure("hibernate.cfg.xml");
	  SessionFactory factory=cfg.buildSessionFactory();
	      
	  Session session=factory.openSession();
	      
	  Query qu = session.createQuery("from Employee");
	  
	  qu.setFirstResult(2);
	  
	  qu.setMaxResults(4);
	  
	  
	  List<Employee> list = qu.list();
	  
	  for(Employee e : list)
	  {
System.out.println(e.getId()+ " "+e.getName()+ " "+e.getDesignation()+" "+e.getCity() );
	  }
	      
	  session.close();
	  factory.close();

	}

}
