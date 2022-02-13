package com.bsale.bsale.service;

import java.util.ArrayList;
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
    public List<CategoryModel> getCategorys() throws Exception{
        Iterable<CategoryModel> cAll = cRepository.findAll();
        List<CategoryModel> response = StreamSupport.stream(cAll.spliterator(), false).collect(Collectors.toList());
        return response;
    }
    
    @Override
    public List<ProductModel> getProducts() throws Exception{
        Iterable<ProductModel> pAll = pRepository.findAll();
        List<ProductModel> response = StreamSupport.stream(pAll.spliterator(), false).collect(Collectors.toList());
        return response;
    }

    @Override
    public List<ProductModel> filterProductByCategory(int categoryId) throws Exception{
        try {

            Iterable<ProductModel> pAll = pRepository.findAll();
            List<ProductModel> response = new ArrayList<>();

            for (ProductModel filter : pAll){
                if (filter.getCategory() == categoryId){
                    response.add(filter);
                } 
            }

            return response;
        } catch (Exception e){
            throw e;
        }
        
    }
}
