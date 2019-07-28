package com.dongho.df.domain.creational.builder.pizza;

public class HawaiianPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("cross");
    }

    @Override
    public void buildSause() {
        pizza.setSause("mild");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("ham + pineapple");
    }

}
