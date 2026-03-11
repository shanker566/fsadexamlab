package com.klef.fsad.exam; 
import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
public class ClientDemo { 
public static void main(String[] args) throws Exception { 
SessionFactory factory=new Configuration().configure().addAnnotatedClass(Supplier.class).buildSessionFactory(); 
Session session=factory.openSession(); 
session.beginTransaction(); 
Supplier s=new Supplier(); 
s.setName("Shanker"); 
s.setDescription("Student ID: 2400080042"); 
s.setStatus("Active"); 
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy"); 
Date d=sdf.parse("11-03-2026"); 
s.setDate(d); 
session.save(s); 
session.getTransaction().commit(); 
System.out.println("Inserted Successfully"); 
} 
} 
