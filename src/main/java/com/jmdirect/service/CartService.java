package com.jmdirect.service;

import com.jmdirect.model.Cart;

/**
 * Created by Jatin Mehta on 09/03/2017.
 */
public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
