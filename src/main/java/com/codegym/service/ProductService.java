package com.codegym.service;


import com.codegym.dao.IProductDAO;
import com.codegym.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductDAO productDAO;

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productDAO.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productDAO.save(product);
    }

    @Override
    public void removeById(Long id) {
        productDAO.removeById(id);
    }

    @Override
    public List<Product> findProductByNameContaining(String name) {
        name = "%" + name + "%";
        return productDAO.findProductByNameContaining(name);
    }
}
