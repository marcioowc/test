package com.contabilizei.teste.product.controller;

import java.util.List;

import com.contabilizei.teste.product.dao.ProductDAO;
import com.contabilizei.teste.product.dao.persistence.ProductDAOPersistence;
import com.contabilizei.teste.product.model.Product;

public class ProductController {
	
	public Product findById(Integer id){
		
		ProductDAO dao = new ProductDAOPersistence(Product.class);
		return dao.findById(id);
		
	}

}
