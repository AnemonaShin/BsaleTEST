package com.bsale.bsale.controller;

import java.util.List;

import com.bsale.bsale.model.CategoryModel;
import com.bsale.bsale.model.ProductModel;
import com.bsale.bsale.service.StoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

    @Autowired
    StoreService service;
    
    @GetMapping("/store/list/category")
    public List<CategoryModel> getCategorys(){

        return service.getCategorys();

    }

    @GetMapping("/store/list/product")
    public List<ProductModel> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/store/list/{category_name}")
    public List<ProductModel> filterProductByCategory(
        @PathVariable(name = "category_name") String categoryName
    ){
        return service.filterProductByCategory(categoryName);
    }
}