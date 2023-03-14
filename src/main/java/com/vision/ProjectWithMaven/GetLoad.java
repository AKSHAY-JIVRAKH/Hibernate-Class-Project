package com.vision.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetLoad {

	public static void main(String[] args) {
		
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	Session session=factory.openSession();
	
    Employee emp=(Employee)session.get(Employee.class, 1);
	System.out.println(emp);
	System.out.println(emp.getName()+" "+emp.getCity());
	
	Address address=(Address)session.load(Address.class, 3);
	System.out.println(address);
	System.out.println(address.getStreet()+" "+address.getState());

	session.close();
	factory.close();
	}
}