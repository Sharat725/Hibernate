package controller;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
	EntityManagerFactory emf	=Persistence.createEntityManagerFactory("dev");
	EntityManager em=	emf.createEntityManager();
	EntityTransaction et=	em.getTransaction();
	

	// insertion
	Student s1 = new Student();
	s1.setStd_id(101);
	s1.setStd_name("chinnu");
	s1.setStd_sec('A');
	
	Student s2=new Student();
	s2.setStd_id(102);
	s2.setStd_name("muddu");
	s2.setStd_sec('A');
	
	Student s3 = new Student();
	s3.setStd_id(103);
	s3.setStd_name("Kumar");
	s3.setStd_sec('A');
	
	
	Course c1=new Course();
	c1.setC_id(201);
	c1.setC_name("Java");
	
	Course c2 = new Course();
	c2.setC_id(202);
	c2.setC_name("JavaScript");
	
	Course c3 = new Course();
	c3.setC_id(203);
	c3.setC_name("React");
		
	List<Student> l1 = new ArrayList<Student>();
	l1.add(s1);
	l1.add(s2);
	l1.add(s3);
	
	List<Course> c= new ArrayList<Course>();
	c.add(c1);
	c.add(c2);
	c.add(c3);
	
	c1.setLl(l1);
	c2.setLl(l1);
	c3.setLl(l1);
	
	s1.setL(c);
	s2.setL(c);
	s3.setL(c);
	
	et.begin();
	em.persist(s1);
	em.persist(s2);
	em.persist(s3);
	em.persist(c1);
	em.persist(c2);
	em.persist(c3);
	et.commit();
	}


}
