package com.example.addToCart.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.addToCart.Entity.Cart;
import com.example.addToCart.Service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    CartService cartService;

    @PostMapping("/add")
    public void addItemToCart(@RequestBody Cart cart) {
        cartService.addItemToCartService(cart);
    }

    @DeleteMapping("/remove")
    public void removeItemFromCart(@RequestBody Cart cart) {
        cartService.removeItemFromCartService(cart);
    
    }
}
