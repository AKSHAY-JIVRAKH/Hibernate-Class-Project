package com.vision.Hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.vision.ProjectWithMaven.Employee;

public class Hql {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory=cfg.buildSessionFactory();
	    
	    Session session=factory.openSession();
	    
	    session.beginTransaction();
	    //HQL query
	    
	    //String query="from Employee as emp where emp.id =2 and emp.city=:C";
	    
	    //Query que=session.createQuery(query);
	    
	    Query q1=session.createQuery("from Employee as emp where emp.id =2 and emp.city=:C");
	    
	    //q1.setParameter("A", 3);
	    q1.setParameter("C", "Pune");
	    
	    List<Employee> list=q1.list();
	    
	    for(Employee e : list)
	    {
	    
	    System.out.println(e.getName()+" "+ e.getDesignation());
	    }
	    System.out.println("Selected....");
	    
	    //Delete 
	    
//	    Query q2=session.createQuery("Delete from Employee where id=:i");
//	    q2.setParameter("i", 3);
//	    
//	    int d=q2.executeUpdate();
//	    
//	    System.out.println("Deleted....");
//	    System.out.println(d);
	    	
	    //Update
	    Query q3=session.createQuery("update Employee set city=:c where id=:i");
	    q3.setParameter("c", "Mumbai");
	    q3.setParameter("i", 2);
	    
	    int upd=q3.executeUpdate();
	    System.out.println("Updated....");
	    System.out.println(upd);
	    
	    
	    //Join
	    Query q4=session.createQuery("select e.eid, e.ename,p.pid, p.pname from Employeee as e inner join e.projects as p");
	    
	    List<Object[]> list2=q4.getResultList();
	    
	    for(Object[] arr : list2)
	    {
	     System.out.println(Arrays.toString(arr));
	    }
	    System.out.println("Join....");
	    
	    session.close();
	    factory.close();

	}

}
