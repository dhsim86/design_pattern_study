package com.dongho.df.domain.structural.composite;

import java.util.Collections;
import java.util.List;

public class Line implements Graphic {

    @Override
    public String draw() {
        return "Line";
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
