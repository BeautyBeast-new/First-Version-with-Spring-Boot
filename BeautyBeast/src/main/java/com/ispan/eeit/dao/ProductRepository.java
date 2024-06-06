package com.ispan.eeit.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ispan.eeit.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	List<Product> findAll();
	List<Product> findById(String Id);	
}
