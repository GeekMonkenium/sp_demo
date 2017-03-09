package com.jmdirect.dao;

import com.jmdirect.model.Customer;

import java.util.List;

/**
 * Created by Jatin Mehta on 08/03/2017.
 */
public interface CustomerDao {

    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername (String username);

}
