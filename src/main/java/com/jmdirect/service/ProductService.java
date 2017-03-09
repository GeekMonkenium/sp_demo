package com.jmdirect.service;

import com.jmdirect.model.Product;

import java.util.List;

/**
 * Created by Jatin Mehta on 08/03/2017.
 */
public interface ProductService {
    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
