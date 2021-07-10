package com.spotyshoes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="color")
	private String color;
	
	@Column(name="style")
	private String style;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="size")
	private float size;
	
	@Column(name="price")
	private float price;

	public Product() {
		super();
	}

	public Product(int id, String name, String gender, String color, String style, String brand, float size,
			float price) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.color = color;
		this.style = style;
		this.brand = brand;
		this.size = size;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Product [id=%s, name=%s, gender=%s, color=%s, style=%s, brand=%s, size=%s, price=%s]", id,
				name, gender, color, style, brand, size, price);
	}
	
	
	

}
