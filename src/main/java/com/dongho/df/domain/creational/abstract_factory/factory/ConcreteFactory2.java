package com.dongho.df.domain.creational.abstract_factory.factory;

import com.dongho.df.domain.creational.abstract_factory.object.ProductA2;
import com.dongho.df.domain.creational.abstract_factory.object.ProductB2;

public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public ProductA2 createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB2 createProductB() {
        return new ProductB2();
    }
}
