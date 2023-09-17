package com.example.productdetailservice.Service;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productdetailservice.Entity.Product;
import com.example.productdetailservice.Repo.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepository;

    public Product saveProductToDB(Product product) {
        return productRepository.save(product);
    }

    public ArrayList<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(UUID ProductId) {
        return productRepository.findByProductId(ProductId);
    }
    
}
