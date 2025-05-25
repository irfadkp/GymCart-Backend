package com.gymcart.service;


import com.gymcart.model.Cart;
import com.gymcart.model.Product;
import com.gymcart.repository.CartRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    private final CartRepository cartRepository;

    public CartService (CartRepository cartRepository){
        this.cartRepository=cartRepository;
    }

    public Cart getCart(Long id){
        return cartRepository.findById(id).orElseGet(()->cartRepository.save(new Cart()));
    }

    public Cart addProductToCart(Long cartId,Product product){
        Cart cart = getCart(cartId);

        cart.addProducts(product);
        return cartRepository.save(cart);
    }
}
