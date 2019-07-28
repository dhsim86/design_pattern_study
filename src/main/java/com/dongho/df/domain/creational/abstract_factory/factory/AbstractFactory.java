package com.dongho.df.domain.creational.abstract_factory.factory;

import com.dongho.df.domain.creational.abstract_factory.object.AbstractProductA;
import com.dongho.df.domain.creational.abstract_factory.object.AbstractProductB;

public abstract class AbstractFactory {

    abstract public AbstractProductA createProductA();
    abstract public AbstractProductB createProductB();

}
