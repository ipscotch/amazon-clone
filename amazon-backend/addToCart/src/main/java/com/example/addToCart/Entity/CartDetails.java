package com.example.addToCart.Entity;

import java.util.ArrayList;
import java.util.UUID;

public class CartDetails {
    private UUID userId;
    private ArrayList<Product> cartList;
    public UUID getUserId() {
        return userId;
    }
    public void setUserId(UUID userId) {
        this.userId = userId;
    }
    public ArrayList<Product> getCartList() {
        return cartList;
    }
    public void setCartList(ArrayList<Product> cartList) {
        this.cartList = cartList;
    }
}
