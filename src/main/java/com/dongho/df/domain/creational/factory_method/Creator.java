package com.dongho.df.domain.creational.factory_method;

public abstract class Creator {

    abstract protected Product createProduct();

    public String foo() {
        Product product = createProduct();
        return product.getProductName();
    }

}
