package com.spotyshoes.service;

import java.util.List;

import com.spotyshoes.model.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

}
