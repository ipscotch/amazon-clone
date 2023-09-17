package com.example.addToCart.Service;

import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.addToCart.Entity.Product;

@FeignClient(name = "product-details", url = "localhost:8082")
public interface ProductDetailsProxy {
    @GetMapping("/search/{ProductId}")
    public Product getProductById(@PathVariable UUID productId);
}
