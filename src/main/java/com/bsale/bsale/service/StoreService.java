package com.bsale.bsale.service;

import java.util.List;

import com.bsale.bsale.model.CategoryModel;
import com.bsale.bsale.model.ProductModel;

public interface StoreService {
    
    public List<CategoryModel> getCategorys() throws Exception;
    public List<ProductModel> getProducts() throws Exception;
    public List<ProductModel> filterProductByCategory(int categoryId) throws Exception;

}
