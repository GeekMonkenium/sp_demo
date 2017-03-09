package com.jmdirect.service;

import com.jmdirect.model.CustomerOrder;

/**
 * Created by Jatin Mehta on 09/03/2017.
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
