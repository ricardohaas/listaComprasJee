package org.listaCompras.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.listaCompras.models.ProductCategory;

public class ProductCategoryDAO {
	@PersistenceContext
	private EntityManager manager;
	
	public void save( ProductCategory productCategory ){
		manager.persist(productCategory);
	}
}
