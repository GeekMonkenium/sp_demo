package com.jmdirect.service.impl;

import com.jmdirect.dao.CartDao;
import com.jmdirect.model.Cart;
import com.jmdirect.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jatin Mehta on 09/03/2017.
 */
@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private CartDao cartDao;

    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);
    }

    public void update(Cart cart) {
        cartDao.update(cart);
    }
}
