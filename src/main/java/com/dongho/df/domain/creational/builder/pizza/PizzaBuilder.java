package com.dongho.df.domain.creational.builder.pizza;

public abstract class PizzaBuilder {

    protected Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void buildDough() {

    }

    public void buildSause() {

    }

    public void buildTopping() {

    }

}
