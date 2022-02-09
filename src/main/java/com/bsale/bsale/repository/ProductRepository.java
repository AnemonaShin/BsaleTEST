package com.bsale.bsale.repository;

import com.bsale.bsale.model.ProductModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Integer>{
    
}
