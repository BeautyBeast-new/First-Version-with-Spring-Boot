package com.ispan.eeit.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer product_id;
	
	@Column(name = "product_name")
	private String product_name;
	
	@Column(name = "descridescription")
	private String descridescription;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "Category_id")
	private Integer Category_id;
	
	@Column(name = "image_urlString")
	private String image_urlString;
	
	@Column(name = "stock_quantity")
	private Integer stock_quantity;

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getDescridescription() {
		return descridescription;
	}

	public void setDescridescription(String descridescription) {
		this.descridescription = descridescription;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getCategory_id() {
		return Category_id;
	}

	public void setCategory_id(Integer category_id) {
		Category_id = category_id;
	}

	public String getImage_urlString() {
		return image_urlString;
	}

	public void setImage_urlString(String image_urlString) {
		this.image_urlString = image_urlString;
	}

	public Integer getStock_quantity() {
		return stock_quantity;
	}

	public void setStock_quantity(Integer stock_quantity) {
		this.stock_quantity = stock_quantity;
	}
}
