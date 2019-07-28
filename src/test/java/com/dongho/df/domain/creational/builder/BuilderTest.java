package com.dongho.df.domain.creational.builder;

import com.dongho.df.domain.creational.builder.pizza.HawaiianPizzaBuilder;
import com.dongho.df.domain.creational.builder.pizza.Pizza;
import com.dongho.df.domain.creational.builder.pizza.PizzaDirector;
import com.dongho.df.domain.creational.builder.pizza.SpicyPizzaBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class BuilderTest {

    @Test
    public void hawaiianPizzaBuildTest() {
        PizzaDirector pizzaDirector;

        given: {
            pizzaDirector = new PizzaDirector();
            pizzaDirector.setPizzaBuilder(new HawaiianPizzaBuilder());
        }

        when: {
            pizzaDirector.constructPizza();
        }

        then: {
            Pizza pizza = pizzaDirector.getPizza();

            assertThat(pizza.getDough()).isEqualTo("cross");
            assertThat(pizza.getSause()).isEqualTo("mild");
            assertThat(pizza.getTopping()).isEqualTo("ham + pineapple");
        }

    }

    @Test
    public void spicyPizzaBuildTest() {
        PizzaDirector pizzaDirector;

        given: {
            pizzaDirector = new PizzaDirector();
            pizzaDirector.setPizzaBuilder(new SpicyPizzaBuilder());
        }

        when: {
            pizzaDirector.constructPizza();
        }

        then: {
            Pizza pizza = pizzaDirector.getPizza();

            assertThat(pizza.getDough()).isEqualTo("pan baked");
            assertThat(pizza.getSause()).isEqualTo("hot");
            assertThat(pizza.getTopping()).isEqualTo("pepperoni + salami");
        }

    }

}
