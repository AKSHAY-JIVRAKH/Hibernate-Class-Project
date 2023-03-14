package com.vision.ProjectWithMaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 * Hello world!
 */

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
      System.out.println("Hello World!");
        
      Configuration cfg = new Configuration();
      cfg.configure("hibernate.cfg.xml");
      SessionFactory factory=cfg.buildSessionFactory();
      //System.out.println(factory);
      
      //Employee Object
      Employee emp=new Employee();
      emp.setName("Ajay");
      emp.setDesignation("Software Engineer");
      emp.setCity("pune");
      System.out.println(emp);
      
      System.out.println("Employee object");
           
      //Address Object
      Address ad=new Address();
      ad.setStreet("streetNo03");
      ad.setState("MH");
      ad.setPincode(423703);
      ad.setAddeddate(new Date());
      ad.setAbc(123);
      System.out.println("Address object");
      
      //Image reading part
      FileInputStream fis=new FileInputStream("src/main/java/Tiger.jpg");
      byte[] data=new byte[fis.available()];
      fis.read(data);
      ad.setImages(data);
      System.out.println("Image Added...");
      
      Session session=factory.openSession();
      
      session.beginTransaction();
      
      session.save(emp);
      session.save(ad);
      
      session.getTransaction().commit();
      
      session.close();
      
      System.out.println("Project close");
    }
}
