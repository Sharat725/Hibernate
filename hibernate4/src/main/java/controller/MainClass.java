package controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em= emf.createEntityManager();
	EntityTransaction et= em.getTransaction();
	
	//Insertion
	
	Person p1=new Person();
	p1.setP_id(101);
	p1.setP_name("AAA");
	p1.setP_phno(5623147890l);
	
	Person p2 = new Person();
	p2.setP_id(102);
	p2.setP_name("BBB");
	p2.setP_phno(4561230789l);
	
	Voter v1=new Voter();
	v1.setV_id("SDFG1232S5");
	
	Voter v2=new Voter();
	v2.setV_id("HKL5632H1");
	
	//oneToOne Mapping
	p1.setV(v1);
	p2.setV(v2);
	
	v1.setP(p1);
	v2.setP(p2);
	
	et.begin();
	em.persist(p1);
	em.persist(p2);
	em.persist(v1);
	em.persist(v2);
	et.commit();
	
		
	}

}
