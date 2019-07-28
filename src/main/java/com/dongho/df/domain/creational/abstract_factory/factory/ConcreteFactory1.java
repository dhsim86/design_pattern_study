package com.dongho.df.domain.creational.abstract_factory.factory;

import com.dongho.df.domain.creational.abstract_factory.object.ProductA1;
import com.dongho.df.domain.creational.abstract_factory.object.ProductB1;

public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public ProductA1 createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB1 createProductB() {
        return new ProductB1();
    }

}
