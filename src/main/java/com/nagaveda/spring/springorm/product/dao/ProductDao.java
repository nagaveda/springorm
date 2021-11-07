package com.nagaveda.spring.springorm.product.dao;

import java.util.List;

import com.nagaveda.spring.springorm.product.entity.Product;

public interface ProductDao {
    int create(Product product);

    void update(Product product);

    void delete(Product product);

    Product read(int id);

    List<Product> readAll();
}
