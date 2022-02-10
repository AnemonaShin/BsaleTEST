package com.bsale.bsale.service;

import java.util.List;

import com.bsale.bsale.model.CategoryModel;
import com.bsale.bsale.model.ProductModel;

public interface StoreService {
    
    public List<CategoryModel> getCategorys();
    public List<ProductModel> getProducts();
    public List<ProductModel> filterProductByCategory(String categoryName);

}
