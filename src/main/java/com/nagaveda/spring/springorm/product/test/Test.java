package com.nagaveda.spring.springorm.product.test;

import com.nagaveda.spring.springorm.product.dao.ProductDao;
import com.nagaveda.spring.springorm.product.entity.Product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/nagaveda/spring/springorm/product/test/config.xml");
        ProductDao productDao = (ProductDao) context.getBean("productDao");
        // Product product = new Product();
        // product.setId(3);
        // product.setName("Pen");
        // product.setPrice(10.50);
        // product.setDescription("Fountain Pen");
        // productDao.create(product);

        List<Product> products = productDao.readAll();
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
