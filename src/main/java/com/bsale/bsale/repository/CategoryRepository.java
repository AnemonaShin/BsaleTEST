package com.bsale.bsale.repository;

import com.bsale.bsale.model.CategoryModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryModel, Integer> {
    
}
