package br.com.fiap.drone.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManager manager;
	
	public static EntityManager getManager() {
		if (manager == null) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("missao");
			manager = factory.createEntityManager();
			
		}
		
		return manager;
		
		
	}

}
