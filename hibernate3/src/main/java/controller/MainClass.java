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
		
		
		// insertion
		Person p1=new Person();
		p1.setP_id(101);
		p1.setP_name("Kumar");
		p1.setP_phno(7894561230l);
		
		Person p2=new Person();
		p2.setP_id(102);
		p2.setP_name("Sampat");
		p2.setP_phno(6541230789l);
		
		Adhar a1=new Adhar();
		a1.setA_no(123456413698l);
		
		Adhar a2=new Adhar();
		a2.setA_no(120458967412l);
		
		//oneToOne mapping
		p1.setA(a1);
		p2.setA(a2);
		
		a1.setP(p1);
		a2.setP(p2);
		
		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(a1);
		em.persist(a2);
		et.commit();
		System.out.println();
	
	}

}
