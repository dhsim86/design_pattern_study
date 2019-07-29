package com.dongho.df.domain.creational.factory_method;

public class ConcreteProductBCreator extends Creator {

    @Override
    protected Product createProduct() {
        return new ConcreteProductB();
    }
}
