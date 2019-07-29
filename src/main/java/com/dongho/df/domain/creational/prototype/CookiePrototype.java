package com.dongho.df.domain.creational.prototype;

public class CookiePrototype implements Cloneable {

    public String getName() {
        return "prototypeName";
    }

    @Override
    protected CookiePrototype clone() {
        try {
            return CookiePrototype.class.cast(super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
