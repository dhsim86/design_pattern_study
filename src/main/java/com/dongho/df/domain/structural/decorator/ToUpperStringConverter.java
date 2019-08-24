package com.dongho.df.domain.structural.decorator;

public class ToUpperStringConverter implements StringConverter {

    @Override
    public String convert(String string) {
        return string.toUpperCase();
    }

}
