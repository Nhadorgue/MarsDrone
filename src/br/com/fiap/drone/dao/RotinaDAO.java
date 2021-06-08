package br.com.fiap.drone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.drone.model.Rotina;
import br.com.fiap.drone.util.JPAUtil;

public class RotinaDAO {
	
	EntityManager manager = JPAUtil.getManager();

	public void cadastrar(Rotina rotina) {
		
		manager.getTransaction().begin();
		manager.persist(rotina);
		manager.getTransaction().commit();
		
		manager.close();
		
	}
	
	public List<Rotina> consultar() {
		
		TypedQuery<Rotina> query = manager.createQuery("SELECT r FROM Rotina r", Rotina.class);
		return query.getResultList();
		
	}
	

}
