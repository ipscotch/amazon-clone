package com.example.productdetailservice.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.productdetailservice.Entity.Product;
import com.example.productdetailservice.Service.ProductService;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProductToDB(product);
    }

    @GetMapping("/getAllProducts")
    public ArrayList<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/search/{ProductId}")
    public Product getProductById(@PathVariable UUID productId) {
        return productService.getProductById(productId);
    } 

}