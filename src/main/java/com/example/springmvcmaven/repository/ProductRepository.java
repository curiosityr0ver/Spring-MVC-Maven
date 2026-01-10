package com.example.springmvcmaven.repository;

import com.example.springmvcmaven.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByOem(String oem);

    List<Product> findByWarrantyBefore(Instant instant);

}
