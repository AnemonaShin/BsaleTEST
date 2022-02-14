package com.bsale.bsale.controller;

import java.util.List;

import com.bsale.bsale.model.CategoryModel;
import com.bsale.bsale.model.ProductModel;
import com.bsale.bsale.service.StoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class StoreController {

    @Autowired
    StoreService service;
    
    @GetMapping("/store/list/category")
    public List<CategoryModel> getCategorys() throws Exception{

        return service.getCategorys();

    }

    @GetMapping("/store/list/product")
    public List<ProductModel> getProducts() throws Exception{
        return service.getProducts();
    }

    @GetMapping("/store/list/{category_id}")
    public List<ProductModel> filterProductByCategory(
        @PathVariable(name = "category_id") int categoryId
    ) throws Exception{
        return service.filterProductByCategory(categoryId);
    }
}