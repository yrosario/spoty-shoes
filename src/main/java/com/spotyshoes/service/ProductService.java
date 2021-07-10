package com.spotyshoes.service;

import java.util.List;

import com.spotyshoes.model.Product;

public interface ProductService {

	public List<Product> getProducts();
	
	public void saveProduct(Product product);
	
	public Product getProduct(int id);
	
}
