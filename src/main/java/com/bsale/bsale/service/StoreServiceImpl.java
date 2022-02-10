package com.bsale.bsale.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.bsale.bsale.model.CategoryModel;
import com.bsale.bsale.model.ProductModel;
import com.bsale.bsale.repository.CategoryRepository;
import com.bsale.bsale.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService{

    @Autowired
    CategoryRepository cRepository;
	
    @Autowired
    ProductRepository pRepository;

    @Override
    public List<CategoryModel> getCategorys() {
        Iterable<CategoryModel> cAll = cRepository.findAll();
        List<CategoryModel> response = StreamSupport.stream(cAll.spliterator(), false).collect(Collectors.toList());
        return response;
    }
    
    @Override
    public List<ProductModel> getProducts() {
        Iterable<ProductModel> pAll = pRepository.findAll();
        List<ProductModel> response = StreamSupport.stream(pAll.spliterator(), false).collect(Collectors.toList());
        return response;
    }

    @Override
    public List<ProductModel> filterProductByCategory(String categoryName) {
        Iterable<CategoryModel> cAll = cRepository.findAll();
        List<CategoryModel> category = StreamSupport.stream(cAll.spliterator(), false).collect(Collectors.toList());
        
        Iterable<ProductModel> pAll = pRepository.findAll();
        List<ProductModel> product = StreamSupport.stream(pAll.spliterator(), false).collect(Collectors.toList());



        return product;
    }
}
