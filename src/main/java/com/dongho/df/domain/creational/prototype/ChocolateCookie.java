package com.dongho.df.domain.creational.prototype;

public class ChocolateCookie extends CookiePrototype {

    @Override
    public String getName() {
        return "chocolateCookie";
    }

    @Override
    protected ChocolateCookie clone() {
        return ChocolateCookie.class.cast(super.clone());
    }
}
