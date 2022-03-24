package com.codegym.dao;

import com.codegym.model.Product;

import java.util.List;

public interface IProductDAO {
    List<Product> findAll();

    Product findById(Long id);

    Product save(Product product);

    void removeById(Long id);

    List<Product> findProductByNameContaining(String name);
}
