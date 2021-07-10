package com.spotyshoes.dao;

import java.util.List;

import com.spotyshoes.model.Product;

public interface ProductDAO {
	
	public List<Product> getProducts();
	
	public void saveProduct(Product product);
	
	public Product getProduct(int id);

}
