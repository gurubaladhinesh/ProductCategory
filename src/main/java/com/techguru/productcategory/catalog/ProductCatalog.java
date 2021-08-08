package com.techguru.productcategory.catalog;

import com.techguru.productcategory.category.Category;
import com.techguru.productcategory.product.Product;

public interface ProductCatalog {

    void getProducts(Category category);

    void getCategoryPath(Product product);

    Product addProduct(Product product, Category category);

    Category addCategory(Category category);

    static ProductCatalog getInstance() {
        return ProductCatalogImpl.getInstance();
    }
}
