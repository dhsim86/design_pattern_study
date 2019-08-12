package com.dongho.df.domain.creational.singleton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class SingletonTest {

    @Test
    public void singletonTest() {
        Singleton instance0;
        Singleton instance1;

        given: {

        }

        when: {
            instance0 = Singleton.getInstance();
            instance1 = Singleton.getInstance();
        }

        then: {
            assertThat(instance0).isEqualTo(instance1);
        }

    }

    @Test
    public void lazySingletonTest() {
        boolean prevStatus;
        boolean curStatus;
        LazySingleton lazySingleton;

        given: {

        }

        when: {
            prevStatus = LazySingleton.initialized;
            lazySingleton = LazySingleton.getInstance();
            curStatus = LazySingleton.initialized;
        }

        then: {
            assertThat(prevStatus).isFalse();
            assertThat(curStatus).isTrue();
            assertThat(lazySingleton).isNotNull();
        }
    }

}
