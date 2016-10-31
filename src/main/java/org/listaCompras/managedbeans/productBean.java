package org.listaCompras.managedbeans;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import org.listaCompras.daos.ProductDAO;
import org.listaCompras.models.Product;
import javax.transaction.Transactional;;

@Model
public class productBean {
	Product product = new Product();
	@Inject
	private ProductDAO productDAO;
	
	@Transactional
	public void save(){
		//System.out.println("Salvar o produto" );
		productDAO.save(product);
	}
	
	public Product getProduct(){
		return product;
	}
}
