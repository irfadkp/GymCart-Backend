package com.gymcart.controller;

import com.gymcart.model.Cart;
import com.gymcart.model.Product;
import com.gymcart.service.CartService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService){
        this.cartService=cartService;
    }

    @GetMapping("/{id}")
    public Cart getCart(@PathVariable Long id) {
        return cartService.getCart(id);
    }

    @PostMapping("/{id}/add")
    public Cart addProductToCart(@PathVariable Long id, @RequestBody Product product){
        return cartService.addProductToCart(id, product);
    }
}
