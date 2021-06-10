package br.com.fiap.drone.dao;

import java.util.List;

import javax.persistence.EntityManager;
<<<<<<< HEAD
import javax.persistence.EntityTransaction;
=======
<<<<<<< HEAD
import javax.persistence.EntityTransaction;
=======
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
>>>>>>> 2b6207b9e4acee98e51cf6e8d3bff1b29861b7ed
import javax.persistence.TypedQuery;

import br.com.fiap.drone.model.Rotina;
import br.com.fiap.drone.util.JPAUtil;

public class RotinaDAO {
	
	EntityManager manager = JPAUtil.getManager();
<<<<<<< HEAD
	EntityTransaction transaction = manager.getTransaction();
=======
<<<<<<< HEAD
	EntityTransaction transaction = manager.getTransaction();
=======
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
>>>>>>> 2b6207b9e4acee98e51cf6e8d3bff1b29861b7ed

	public void cadastrar(Rotina rotina) {
		try {
			transaction.begin();
			manager.persist(rotina);
			transaction.commit();
			//manager.close();
			
		} catch (Exception e) {
			transaction.rollback();

		}
		
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 2b6207b9e4acee98e51cf6e8d3bff1b29861b7ed
	}
	
	public List<Rotina> consultar() {
		
		TypedQuery<Rotina> query = manager.createQuery("SELECT r FROM Rotina r", Rotina.class);
		return query.getResultList();
<<<<<<< HEAD
=======
=======
		manager.getTransaction().begin();
		manager.persist(rotina);
		manager.getTransaction().commit();
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
>>>>>>> 2b6207b9e4acee98e51cf6e8d3bff1b29861b7ed
		
	}
	
	public void apagar(Long id) {
		Rotina rotina = manager.find(Rotina.class, id);
<<<<<<< HEAD
		
		manager.getTransaction().begin();
		manager.remove(rotina);
		manager.getTransaction().commit();
=======
>>>>>>> 2b6207b9e4acee98e51cf6e8d3bff1b29861b7ed
		
<<<<<<< HEAD
		manager.getTransaction().begin();
		manager.remove(rotina);
		manager.getTransaction().commit();
=======
	}
<<<<<<< HEAD
=======
	
	public List<Rotina> consultar() {
		
		TypedQuery<Rotina> query = manager.createQuery("SELECT r FROM Rotina r", Rotina.class);
		return query.getResultList();
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
		
	}
>>>>>>> 2b6207b9e4acee98e51cf6e8d3bff1b29861b7ed

}
