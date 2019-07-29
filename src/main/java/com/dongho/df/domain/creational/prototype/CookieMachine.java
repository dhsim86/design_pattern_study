package com.dongho.df.domain.creational.prototype;

public class CookieMachine {

    private CookiePrototype cookiePrototype;

    public void setCookiePrototype(CookiePrototype cookiePrototype) {
        this.cookiePrototype = cookiePrototype;
    }

    public CookiePrototype makeCookie() {
        CookiePrototype cookie = cookiePrototype.clone();

        // Do something for another initialization.

        return cookie;
    }

}
