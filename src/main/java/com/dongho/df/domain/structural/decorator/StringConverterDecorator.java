package com.dongho.df.domain.structural.decorator;

public class StringConverterDecorator implements StringConverter {

    private StringConverter converter;

    public StringConverterDecorator(StringConverter converter) {
        this.converter = converter;
    }

    @Override
    public String convert(String string) {
        // Do Additional function.
        return converter.convert(string) + "_DECORATOR";
    }

}
