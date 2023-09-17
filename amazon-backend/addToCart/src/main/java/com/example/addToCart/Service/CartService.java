package com.example.addToCart.Service;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addToCart.Entity.Cart;
import com.example.addToCart.Entity.CartDetails;
import com.example.addToCart.Entity.Product;
import com.example.addToCart.Repo.CartRepo;

@Service
public class CartService {
    @Autowired
    CartRepo cartRepo;

    @Autowired
    ProductDetailsProxy productDetailsProxy;

    public void addItemToCartService(Cart cart) {
        cartRepo.save(cart);
    }

    public void removeItemFromCartService(Cart cart) {
        cartRepo.delete(cart);
    }

    public CartDetails displayProductsInCart(UUID userId) {
        CartDetails cartDetails = new CartDetails();
        cartDetails.setUserId(userId);

        ArrayList<Cart> list = cartRepo.findByuserId(userId);
        ArrayList<Product> products = new ArrayList<>();

        for (Cart cart : list) {
            Product product = productDetailsProxy.getProductById(cart.getProductId());
            products.add(product);
        }

        cartDetails.setCartList(products);
        return cartDetails;
    }
}
