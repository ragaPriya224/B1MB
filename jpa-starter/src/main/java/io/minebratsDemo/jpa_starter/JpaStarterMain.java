package io.minebratsDemo.jpa_starter;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class JpaStarterMain {
	public static void main( String[] args ) {
		System.out.println( "Hello World!" );
		Employee e = new Employee();
//		e.setId(121);
		e.setName("developer");
		e.setAge(12);
		e.setDob(new Date());
		e.setType(EmployeeType.FULLTIME);
		
		Employee e2 = new Employee();
//		e2.setId(100);
		e2.setName("dev45");
	
		
//		Employee e3 = new Employee();
//		e3.setId(420);
//		e3.setName("tester");
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("myApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction(); //give me transaction instance 
		entityTransaction.begin();  //star tthe transaction 
		entityManager.persist(e);
		entityManager.persist(e2);
//		entityManager.persist(e3);
		entityTransaction.commit(); 
		
		
		
	}
}
