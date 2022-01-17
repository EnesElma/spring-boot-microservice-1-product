package com.sha.springbootmicroservice1product.service;

import com.sha.springbootmicroservice1product.entity.Product;

import java.util.List;

public interface IProductService{
    Product saveProduct(Product product);

    void deleteProduct(Long product_id);

    List<Product> findAll();
}
