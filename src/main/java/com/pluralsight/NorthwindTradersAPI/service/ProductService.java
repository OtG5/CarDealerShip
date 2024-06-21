package com.pluralsight.NorthwindTradersAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    private final ProductDAO productDAO;

    @Autowired
    public ProductService(ProductDAO, productDAOImpl) {
        this.productDAO = productDAOImpl;
    }

    Public String getAllProducts(){
        return productDa
    }

}
