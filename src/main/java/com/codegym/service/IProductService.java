package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(Long id);

    Product save(Product product);

    void removeById(Long id);

    List<Product> findProductByNameContaining(String name);
}
