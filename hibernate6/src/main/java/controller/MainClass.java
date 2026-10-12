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
	
	
	Trainer t1 = new Trainer();
	t1.setT_id(201);
	t1.setI_name("Sudeep");
		
	List<Student> l1 = new ArrayList<Student>();
	l1.add(s1);
	l1.add(s2);
	l1.add(s3);
	
	t1.setL1(l1);
	
	et.begin();
	em.persist(s1);
	em.persist(s2);
	em.persist(s3);
	em.persist(t1);
	et.commit();
	}

}
