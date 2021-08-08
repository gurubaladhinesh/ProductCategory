package com.techguru.productcategory.category;

public class CategoryImpl implements Category {

    CategoryEnum name;

    Category parent;

    @Override
    public String getName() {
        return name.toString();
    }

    @Override
    public Category getParent() {
        return parent;
    }

    public CategoryImpl(CategoryEnum name, Category parent) {
        this.name = name;
        this.parent = parent;
    }

}
