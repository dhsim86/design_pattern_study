package com.dongho.df.domain.structural.decorator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class DecoratorTest {

    @Test
    public void decoratorTest() {
        StringConverter converter;
        String result;

        given: {
            converter = new StringConverterDecorator(new ToUpperStringConverter());
        }

        when: {
            result = converter.convert("decoratorTest");
        }

        then:{
            assertThat(result).isEqualTo("DECORATORTEST_DECORATOR");
        }
    }

}
