package com.vision.SqlQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.vision.ProjectWithMaven.Employee;

public class SqlQuery {

	public static void main(String[] args) {
	Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory=cfg.buildSessionFactory();
    
    Session session=factory.openSession();

    String q1= "select * from Information_Technology where id = 4";
    
    NativeQuery a = session.createSQLQuery(q1);
    
    
    List<Object[]> list = a.list();
	  
	  for(Object[] e : list)
	  {
           System.out.println(Arrays.toString(e));
	  }
    
    session.close();
    factory.close();

	}

}
