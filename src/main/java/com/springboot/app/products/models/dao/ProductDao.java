package com.springboot.app.products.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.products.models.entity.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Long>{

}
