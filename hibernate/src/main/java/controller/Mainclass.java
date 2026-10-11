package controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mainclass {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		 EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		
		// insertion
//		Student s1 = new Student();
//		s1.setStd_id(1);
//		s1.setStd_name("chinnu");
//		s1.setStd_sec('A');
//		
//		Student s2=new Student();
//		s2.setStd_id(2);
//		s2.setStd_name("muddu");
//		s2.setStd_sec('A');
//		
//		et.begin();
//		em.persist(s1);
//		em.persist(s2);
//		et.commit();
//		System.out.println("values inserted");
		
		//Update
//		Student s3 = em.find(Student.class, 2);
//		s3.setStd_name("rajuu");
//		
//		et.begin();
//		em.persist(s3);
//		et.commit();
//		System.out.println("Values updated");
		
		//Fetch
//		Student s4 = em.find(Student.class, 1);
//		System.out.println(s4.getStd_id()+" "+s4.getStd_name()+" "+s4.getStd_sec());
//		
//		et.begin();
//		em.persist(s4);
		
		//Delete
		Student s5 = em.find(Student.class, 2);
		et.begin();
		em.remove(s5);
		et.commit();
		System.out.println("Values deleted");
		
		
		
		
		
	}

}
