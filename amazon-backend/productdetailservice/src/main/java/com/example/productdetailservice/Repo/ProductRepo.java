package com.example.productdetailservice.Repo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.productdetailservice.Entity.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, BigInteger> {
    Product save(Product product);
    ArrayList<Product> findAll();
    Product findByProductId(UUID id);
}
