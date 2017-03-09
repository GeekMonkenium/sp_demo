package com.jmdirect.dao;

import com.jmdirect.model.Product;

import java.util.List;

/**
 * Created by user on 08/03/2017.
 */
public interface ProductDao {
    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);

}
