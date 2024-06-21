package com.pluralsight.NorthwindTradersAPI.dao;

public interface ProductDao {
    Product getByName();
    Product getByCategoryID();

    String getAllProducts();
}
