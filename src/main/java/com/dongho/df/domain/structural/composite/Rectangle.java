package com.dongho.df.domain.structural.composite;

import java.util.Collections;
import java.util.List;

public class Rectangle implements Graphic {

    @Override
    public String draw() {
        return "Rectangle";
    }

    @Override
    public int add(Graphic graphic) {
        return 0;
    }

    @Override
    public int remove(Graphic graphic) {
        return 0;
    }

    @Override
    public List<Graphic> getChildren() {
        return Collections.emptyList();
    }
}
