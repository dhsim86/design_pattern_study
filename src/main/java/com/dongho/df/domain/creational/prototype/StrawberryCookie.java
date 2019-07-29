package com.dongho.df.domain.creational.prototype;

public class StrawberryCookie extends CookiePrototype {

    @Override
    public String getName() {
        return "strawberryCookie";
    }

    @Override
    protected StrawberryCookie clone() {
        return StrawberryCookie.class.cast(super.clone());
    }

}
