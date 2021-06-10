package br.com.fiap.drone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import br.com.fiap.drone.model.Rotina;
import br.com.fiap.drone.util.JPAUtil;

public class RotinaDAO {
	
	EntityManager manager = JPAUtil.getManager();
	EntityTransaction transaction = manager.getTransaction();

	public void cadastrar(Rotina rotina) {
		try {
			transaction.begin();
			manager.persist(rotina);
			transaction.commit();
			//manager.close();
			
		} catch (Exception e) {
			transaction.rollback();

		}
		
	}
	
	public List<Rotina> consultar() {
		
		TypedQuery<Rotina> query = manager.createQuery("SELECT r FROM Rotina r", Rotina.class);
		return query.getResultList();
		
	}
	
	public void apagar(Long id) {
		Rotina rotina = manager.find(Rotina.class, id);
		
		manager.getTransaction().begin();
		manager.remove(rotina);
		manager.getTransaction().commit();
		
	}

}
