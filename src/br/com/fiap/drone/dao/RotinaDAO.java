package br.com.fiap.drone.dao;

import java.util.List;

import javax.persistence.EntityManager;
<<<<<<< HEAD
import javax.persistence.EntityTransaction;
=======
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
import javax.persistence.TypedQuery;

import br.com.fiap.drone.model.Rotina;
import br.com.fiap.drone.util.JPAUtil;

public class RotinaDAO {
	
	EntityManager manager = JPAUtil.getManager();
<<<<<<< HEAD
	EntityTransaction transaction = manager.getTransaction();
=======
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612

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
	}
	
	public List<Rotina> consultar() {
		
		TypedQuery<Rotina> query = manager.createQuery("SELECT r FROM Rotina r", Rotina.class);
		return query.getResultList();
=======
		manager.getTransaction().begin();
		manager.persist(rotina);
		manager.getTransaction().commit();
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
		
	}
	
	public void apagar(Long id) {
		Rotina rotina = manager.find(Rotina.class, id);
		
<<<<<<< HEAD
		manager.getTransaction().begin();
		manager.remove(rotina);
		manager.getTransaction().commit();
=======
	}
	
	public List<Rotina> consultar() {
		
		TypedQuery<Rotina> query = manager.createQuery("SELECT r FROM Rotina r", Rotina.class);
		return query.getResultList();
>>>>>>> 76d71bc28b23884746d494c7927121b09b4d5612
		
	}

}
