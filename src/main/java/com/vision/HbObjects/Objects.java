package com.vision.HbObjects;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Objects {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	    cfg.configure("com/vision/HbObjects/hibernate.cfg.xml");
	    SessionFactory factory=cfg.buildSessionFactory();
	      
	    Student student=new Student();
	    student.setSid(101);
	    student.setName("Ak");
	    student.setCity("pune");
	    //Transient 
	          
	    Session session=factory.openSession();
	      
	    session.beginTransaction();
	      
	    session.save(student);
	    //Persistent
	     
	    session.getTransaction().commit();
	   
	    session.close();
	    //detached 
	     
	    student.setName("Ajay");
	    System.out.println(student);
	    System.out.println("Project close");
        factory.close();
	}
}
