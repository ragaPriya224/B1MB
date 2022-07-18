package io.minebratsDemo.jpa_starter;

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
		Employee employee = new Employee();
		employee.setId(121);
		employee.setName("developer");
		Employee e2 = new Employee();
		employee.setId(100);
		employee.setName("dev45");
		Employee e3 = new Employee();
		employee.setId(420);
		employee.setName("tester");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction(); //give me transaction instance 
		entityTransaction.begin();  //star tthe transaction 
		entityManager.persist(employee);
		entityManager.persist(e2);
		entityManager.persist(e3);
		entityTransaction.commit(); 
		
		
		
	}
}
