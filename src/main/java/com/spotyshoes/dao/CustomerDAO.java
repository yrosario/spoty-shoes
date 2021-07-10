package com.spotyshoes.dao;

import java.util.List;

import com.spotyshoes.model.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);
}
