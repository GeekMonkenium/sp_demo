package com.jmdirect.dao;

import com.jmdirect.model.Cart;

import java.io.IOException;

/**
 * Created by Jatin Mehta on 09/03/2017.
 */
public interface CartDao {

    Cart getCartById (int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}
