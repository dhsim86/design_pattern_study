package com.dongho.df.domain.creational.singleton;

import java.util.Objects;

public class Singleton {

    private static Singleton instance;

    static {
        instance = null;
    }

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Singleton();
        }
        return instance;
    }

}
