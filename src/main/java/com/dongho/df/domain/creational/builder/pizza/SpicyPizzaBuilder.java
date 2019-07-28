package com.dongho.df.domain.creational.builder.pizza;

public class SpicyPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    @Override
    public void buildSause() {
        pizza.setSause("hot");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni + salami");
    }

}
