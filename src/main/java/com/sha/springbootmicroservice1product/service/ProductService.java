package com.sha.springbootmicroservice1product.service;

import com.sha.springbootmicroservice1product.entity.Product;
import com.sha.springbootmicroservice1product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository productRepository;

    @Override
    public Product saveProduct(Product product){
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long product_id){
        productRepository.deleteById(product_id);
    }

    @Override
    public List<Product> findAll(){
        return productRepository.findAll();
    }


}
