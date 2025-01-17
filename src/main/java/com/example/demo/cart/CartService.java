package com.example.demo.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CartService implements ICartService {
    private final CartRepository cartRepository;
    @Override
    public Cart createCart() {
        return null;
    }

    public Cart saveCart(Cart cart){
        return this.cartRepository.save(cart);
    }

    @Override
    public ResponseEntity<Void> deleteCart(String id) {
        return null;
    }

    @Override
    public Cart updateCart(String id) {
        return null;
    }
}
