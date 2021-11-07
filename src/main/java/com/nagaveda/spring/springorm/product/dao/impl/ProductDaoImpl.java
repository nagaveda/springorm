package com.nagaveda.spring.springorm.product.dao.impl;

import java.util.List;

import com.nagaveda.spring.springorm.product.dao.ProductDao;
import com.nagaveda.spring.springorm.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int create(Product product) {
        Integer result = (Integer) hibernateTemplate.save(product);
        return result;
    }

    @Override
    @Transactional
    public void update(Product product) {
        hibernateTemplate.update(product);
    }

    @Override
    @Transactional
    public void delete(Product product) {
        hibernateTemplate.delete(product);
    }

    @Override
    public Product read(int id) {
        Product product = hibernateTemplate.get(Product.class, id);
        return product;
    }

    @Override
    public List<Product> readAll() {
        List<Product> products = hibernateTemplate.loadAll(Product.class);
        return products;
    }
}
