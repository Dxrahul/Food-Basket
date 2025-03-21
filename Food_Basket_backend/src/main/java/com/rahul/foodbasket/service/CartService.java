package com.rahul.foodbasket.service;

import com.rahul.foodbasket.io.CartRequest;
import com.rahul.foodbasket.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
