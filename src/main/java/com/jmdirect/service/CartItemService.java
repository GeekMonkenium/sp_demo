package com.jmdirect.service;

import com.jmdirect.model.Cart;
import com.jmdirect.model.CartItem;

/**
 * Created by Jatin Mehta on 09/03/2017.
 */
public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId (int productId);

}
