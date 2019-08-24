package com.dongho.df.domain.structural.composite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class CompositeTest {

    @Test
    public void compositeTest() {
        Graphic graphic;
        String result;

        given: {
            graphic = new Picture();
            graphic.add(new Line());
            graphic.add(new Text());
            graphic.add(new Rectangle());

            Graphic picture = new Picture();
            picture.add(new Line());

            graphic.add(picture);
        }

        when: {
            result = graphic.draw();
        }

        then:{
            assertThat(result).isEqualTo("Line:Text:Rectangle:Line");
            assertThat(graphic.getChildren()).hasSize(4);
        }
    }

}
