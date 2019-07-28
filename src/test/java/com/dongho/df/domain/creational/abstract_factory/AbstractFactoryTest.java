package com.dongho.df.domain.creational.abstract_factory;

import com.dongho.df.domain.creational.abstract_factory.factory.AbstractFactory;
import com.dongho.df.domain.creational.abstract_factory.factory.ConcreteFactory1;
import com.dongho.df.domain.creational.abstract_factory.object.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class AbstractFactoryTest {

    private AbstractFactory abstractFactory;

    @Test
    public void abstractFactoryTest() {
        AbstractProductA abstractProductA;
        AbstractProductB abstractProductB;

        given: {
            abstractFactory = new ConcreteFactory1();
        }

        when: {
            abstractProductA = abstractFactory.createProductA();
            abstractProductB = abstractFactory.createProductB();
        }

        then: {
            assertThat(AbstractProductA.class.isInstance(abstractProductA)).isTrue();
            assertThat(AbstractProductB.class.isInstance(abstractProductB)).isTrue();

            assertThat(ProductA1.class.isInstance(abstractProductA)).isTrue();
            assertThat(ProductB1.class.isInstance(abstractProductB)).isTrue();

            assertThat(ProductA2.class.isInstance(abstractProductA)).isFalse();
            assertThat(ProductB2.class.isInstance(abstractProductB)).isFalse();
        }

    }

}
