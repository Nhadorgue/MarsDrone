package br.com.fiap.drone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.drone.model.Rotina;

public class RotinaDAO {

	public void cadastrar(Rotina rotina) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("missao");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(rotina);
		manager.getTransaction().commit();
		
		manager.close();
		
		
	}
	

}
