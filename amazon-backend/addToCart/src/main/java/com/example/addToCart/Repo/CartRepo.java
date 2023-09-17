package com.example.addToCart.Repo;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.addToCart.Entity.Cart;

@Repository
public interface CartRepo extends CrudRepository<Cart, Long> {
    Cart add(Cart cart);
    void delete(Cart cart);
    ArrayList<Cart> findByuserId(UUID userId);
}
