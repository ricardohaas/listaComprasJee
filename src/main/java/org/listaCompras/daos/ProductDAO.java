package org.listaCompras.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.listaCompras.models.Product;

public class ProductDAO {
	@PersistenceContext
	private EntityManager manager;
	
	public void save( Product product ){
		manager.persist(product);
	}
}
