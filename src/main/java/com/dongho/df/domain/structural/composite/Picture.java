package com.dongho.df.domain.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Picture implements Graphic {

    private List<Graphic> children = new ArrayList<>();

    @Override
    public String draw() {
        return children.stream()
            .map(Graphic::draw)
            .reduce((prev, cur) -> prev + ":" + cur)
            .get();
    }

    @Override
    public int add(Graphic graphic) {
        children.add(graphic);
        return children.size();
    }

    @Override
    public int remove(Graphic graphic) {
        children.remove(graphic);
        return children.size();
    }

    @Override
    public List<Graphic> getChildren() {
        return children;
    }
}
