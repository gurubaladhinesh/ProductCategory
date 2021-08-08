package com.techguru.productcategory.product;

public class ProductImpl implements Product {

    String name;

    String description;

    double price;

    public ProductImpl(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }


}
