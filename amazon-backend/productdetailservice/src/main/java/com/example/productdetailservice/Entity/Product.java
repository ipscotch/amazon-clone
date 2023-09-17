package com.example.productdetailservice.Entity;

import java.math.BigInteger;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

@Entity(name = "product")
public class Product {
    
    @Id
    @GeneratedValue
    private BigInteger id;

    private UUID productId;
    private String name;
    private double price;
    private double rating;
    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    private String imgURL;
    public Product() {
    }
    
    public Product(BigInteger id, UUID productId, String name, double price, double rating, String imgURL) {
        this.id = id;
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.imgURL = imgURL;
    }


}
