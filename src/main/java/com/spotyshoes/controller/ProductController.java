package com.spotyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
