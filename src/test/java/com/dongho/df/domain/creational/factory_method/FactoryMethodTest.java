package com.dongho.df.domain.creational.factory_method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class FactoryMethodTest {

    @Test
    public void concreteProductATest() {
        Creator creator;
        String productName;

        given: {
            creator = new ConcreteProductACreator();
        }

        when: {
            productName = creator.foo();
        }

        then: {
            assertThat(productName).isEqualTo("concreteProductA");
        }

    }

    @Test
    public void concreteProductBTest() {
        Creator creator;
        String productName;

        given: {
            creator = new ConcreteProductBCreator();
        }

        when: {
            productName = creator.foo();
        }

        then: {
            assertThat(productName).isEqualTo("concreteProductB");
        }

    }

}
