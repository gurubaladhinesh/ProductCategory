package com.techguru.productcategory;

import com.techguru.productcategory.catalog.ProductCatalog;
import com.techguru.productcategory.category.Category;
import com.techguru.productcategory.category.CategoryEnum;
import com.techguru.productcategory.category.CategoryImpl;
import com.techguru.productcategory.product.Product;
import com.techguru.productcategory.product.ProductImpl;

public class ProductCategoryMain {

    public static void main(String[] args) {
        ProductCatalog productCatalog = ProductCatalog.getInstance();
        Category electronicCategory = productCatalog.addCategory(new CategoryImpl(CategoryEnum.Electronic, null));
        Category computerCategory = productCatalog.addCategory(new CategoryImpl(CategoryEnum.Computer, electronicCategory));
        Category laptopCategory = productCatalog.addCategory(new CategoryImpl(CategoryEnum.Laptop, computerCategory));
        Category lenovoCategory = productCatalog.addCategory(new CategoryImpl(CategoryEnum.Lenovo, laptopCategory));
        Category macBooksCategory = productCatalog.addCategory(new CategoryImpl(CategoryEnum.MacBooks, laptopCategory));
        Category dellCategory = productCatalog.addCategory(new CategoryImpl(CategoryEnum.Dell, laptopCategory));
        Category tabletCategory = productCatalog.addCategory(new CategoryImpl(CategoryEnum.Tablet, computerCategory));
        Category tvCategory = productCatalog.addCategory(new CategoryImpl(CategoryEnum.TV, electronicCategory));
        Category threeDCategory = productCatalog.addCategory(new CategoryImpl(CategoryEnum.ThreeD, tvCategory));
        Category smartTvCategory = productCatalog.addCategory(new CategoryImpl(CategoryEnum.Smart_TV, tvCategory));
        Category ledTvCategory = productCatalog.addCategory(new CategoryImpl(CategoryEnum.LED_TV, tvCategory));
        Category cameraCategory = productCatalog.addCategory(new CategoryImpl(CategoryEnum.Camera, electronicCategory));
        Category cellPhoneCategory = productCatalog.addCategory(new CategoryImpl(CategoryEnum.CellPhone, electronicCategory));
        Category booksCategory = productCatalog.addCategory(new CategoryImpl(CategoryEnum.Books, null));

        Product appleMacBookAir = productCatalog.addProduct(new ProductImpl("Apple MacBook Air MJVE2LL/A 13-inch Laptop", "Description of Apple MacBook Air MJVE2LL/A 13-inch Laptop", 125000), macBooksCategory);

        productCatalog.getProducts(computerCategory);

        productCatalog.getCategoryPath(appleMacBookAir);
        
    }
}
