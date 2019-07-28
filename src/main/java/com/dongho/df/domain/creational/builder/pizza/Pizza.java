package com.dongho.df.domain.creational.builder.pizza;

public class Pizza {

    private String dough = "";
    private String sause = "";
    private String topping = "";

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSause(String sause) {
        this.sause = sause;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getDough() {
        return dough;
    }

    public String getSause() {
        return sause;
    }

    public String getTopping() {
        return topping;
    }
}
