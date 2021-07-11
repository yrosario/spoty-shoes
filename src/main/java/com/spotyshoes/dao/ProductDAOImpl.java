package com.spotyshoes.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spotyshoes.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Product> getProducts() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Product> query =
				currentSession.createQuery("from Product", Product.class);
		
		List<Product> products = query.getResultList();
		
		for(Product p : products)
			System.out.println(p.toString());
		
		return products;
	}

	@Override
	public void saveProduct(Product product) {
		
		//get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save/update the product
		currentSession.saveOrUpdate(product);

	}

	@Override
	public Product getProduct(int id) {
		
		//get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//get product base on the product id
		Product product = currentSession.get(Product.class, id);
		
		return product;

	}

}
