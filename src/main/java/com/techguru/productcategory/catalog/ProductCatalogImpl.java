package com.techguru.productcategory.catalog;

import com.techguru.productcategory.category.Category;
import com.techguru.productcategory.product.Product;

public class ProductCatalogImpl implements ProductCatalog {

    private static ProductCatalogImpl instance = null;

    @Override
    public void getProducts(Category category) {

    }

    @Override
    public void getCategoryPath(Product product) {

    }

    @Override
    public Product addProduct(Product product, Category category) {
        return product;
    }

    @Override
    public Category addCategory(Category category) {
        return category;
    }

    private ProductCatalogImpl() {

    }

    static ProductCatalogImpl getInstance() {
        if (instance == null) {
            instance = new ProductCatalogImpl();
        }
        return instance;
    }

}
