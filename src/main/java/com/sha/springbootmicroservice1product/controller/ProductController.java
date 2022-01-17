package com.sha.springbootmicroservice1product.controller;

import com.sha.springbootmicroservice1product.entity.Product;
import com.sha.springbootmicroservice1product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private IProductService productService;


    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody Product product){

        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping("{product_id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long product_id){
        productService.deleteProduct(product_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllProduct(){

        return ResponseEntity.ok(productService.findAll());
    }
}
