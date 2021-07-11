package com.spotyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spotyshoes.model.Product;
import com.spotyshoes.service.ProductService;

@Controller
@RequestMapping("/shoe")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/list")
	public String listProducts(Model model) {
		
		List<Product> products = productService.getProducts();
		
		model.addAttribute("products", products);
		
		return "list-product";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model)
	{
		
		Product product = new Product();
		
		model.addAttribute("product", product);
		
		return "product-form";
	}
	
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product") Product product) {
		
		//save the product using our service
		productService.saveProduct(product);
		
		return "redirect:/shoe/list";
	}
	
	//Update product details
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("productId") int id, Model model)
	{
		
		//get the customer from the service
		Product product = productService.getProduct(id);
		
		//set product as a model attribute to pre-populate the form
		model.addAttribute("product", product);
		
		//send over to the product form
		return "product-form";
		
		
	}
}
