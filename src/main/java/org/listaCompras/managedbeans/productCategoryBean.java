package org.listaCompras.managedbeans;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import org.listaCompras.daos.ProductCategoryDAO;
import org.listaCompras.models.ProductCategory;
import javax.transaction.Transactional;;

@Model
public class productCategoryBean {
	ProductCategory productCategory = new ProductCategory();
	@Inject
	private ProductCategoryDAO productCategoryDAO;
	
	@Transactional
	public void save(){
		//System.out.println("Salvar a categorias" );
		productCategoryDAO.save(productCategory);
	}
	
	public ProductCategory getProductCategory(){
		return productCategory;
	}
}
