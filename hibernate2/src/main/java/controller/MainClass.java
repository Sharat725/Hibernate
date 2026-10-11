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
		Person p1 = new Person();
		p1.setP_id(101);
		p1.setP_name("Sharat");
		p1.setP_phno(9632587410l);
		
		Person p2 = new Person();
		p2.setP_id(102);
		p2.setP_name("Sanat");
		p2.setP_phno(7894561230l);
		
		PanCard pc1 = new PanCard();
		pc1.setPan_no("FCVPP4217E");
		
		PanCard pc2 = new PanCard();
		pc2.setPan_no("FCVPP4544F");
		
		
		//OnetoOne Mapping
		p1.setPc(pc1);
		p2.setPc(pc2);
		
		pc1.setP(p1);
		pc2.setP(p2);
		
		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(pc1);
		em.persist(pc2);
		et.commit();
		System.out.println("values inserted");
		
		
	}
	
	
	

}
