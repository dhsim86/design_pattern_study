package com.dongho.df.domain.structural.composite;

import java.util.List;

public interface Graphic {

    String draw();

    int add(Graphic graphic);
    int remove(Graphic graphic);
    List<Graphic> getChildren();

}
