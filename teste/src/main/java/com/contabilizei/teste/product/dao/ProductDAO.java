package com.contabilizei.teste.product.dao;

import com.contabilizei.teste.product.dao.persistence.ProductDAOPersistence;
import com.contabilizei.teste.product.model.Product;
import com.contabilizei.teste.services.CRUDService;

public interface ProductDAO extends CRUDService<Product, Integer>{
	
	@Override
	public abstract void create(Product e);
	
	@Override
	public abstract Product findById(Integer id);

}
