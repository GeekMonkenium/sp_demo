package com.jmdirect.service;

import com.jmdirect.model.Customer;

import java.util.List;

/**
 * Created by Jatin Mehta on 08/03/2017.
 */
public interface CustomerService {
    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername (String username);

}
