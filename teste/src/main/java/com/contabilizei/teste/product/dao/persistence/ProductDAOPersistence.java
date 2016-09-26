package com.contabilizei.teste.product.dao.persistence;

import javax.annotation.PostConstruct;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.contabilizei.teste.product.dao.ProductDAO;
import com.contabilizei.teste.product.model.Product;
import com.contabilizei.teste.product.model.Product_;
import com.contabilizei.teste.services.impl.CRUDServiceImpl;

public class ProductDAOPersistence extends CRUDServiceImpl<Product, Integer> implements ProductDAO {
	
	public ProductDAOPersistence(Class className) {
		super(className);
	}

	@Override
	@PostConstruct
	public void init() {
		this.entityClass = Product.class;
	}
	
	@Override
	public Product findById(Integer id) {
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		Predicate predicate = cb.equal(root.get(Product_.id), id);
		cq.where(predicate);
		TypedQuery<Product> query = em.createQuery(cq);
		return query.getResultList().size() > 0 ? query.getSingleResult() : null;
	}
	

}
