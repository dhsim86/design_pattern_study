package com.dongho.df.domain.creational.factory_method;

public class ConcreteProductACreator extends Creator {

    @Override
    protected Product createProduct() {
        return new ConcreteProductA();
    }

}
