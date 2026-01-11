package com.example.springmvcmaven.Service;

import com.example.springmvcmaven.model.Product;
import com.example.springmvcmaven.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public List<Product> getProductsByOem(String oem) {
//        return repository.findBy()
        return repository.findByOem(oem);
    }

    public List<Product> getProductsExpiringBefore(Integer days) {
        return repository.findByWarrantyBefore(Instant.now().plus(30, ChronoUnit.DAYS));
    }

//    create product
    public Product createProduct(Product product) {
        return repository.save(product);
    }



}
