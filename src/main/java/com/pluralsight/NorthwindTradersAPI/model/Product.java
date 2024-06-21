package com.pluralsight.NorthwindTradersAPI.model;

public class Product {
    private int productId, categoryId;
    private float unitPrice;

    public Product(int productId, int categoryId, float unitPrice) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
}
