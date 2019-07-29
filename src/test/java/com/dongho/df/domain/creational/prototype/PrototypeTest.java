package com.dongho.df.domain.creational.prototype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class PrototypeTest {

    @Test
    public void chocolateCookieTest() {
        CookieMachine cookieMachine;
        CookiePrototype cookiePrototype1;
        CookiePrototype cookiePrototype2;

        given: {
            cookieMachine = new CookieMachine();
            cookieMachine.setCookiePrototype(new ChocolateCookie());
        }

        when: {
            cookiePrototype1 = cookieMachine.makeCookie();
            cookiePrototype2 = cookieMachine.makeCookie();
        }

        then: {
            assertThat(cookiePrototype1).isNotEqualTo(cookiePrototype2);
            assertThat(cookiePrototype1.getName()).isEqualTo("chocolateCookie");
            assertThat(cookiePrototype2.getName()).isEqualTo("chocolateCookie");
        }
    }

    @Test
    public void strawberryCookieTest() {
        CookieMachine cookieMachine;
        CookiePrototype cookiePrototype1;
        CookiePrototype cookiePrototype2;

        given: {
            cookieMachine = new CookieMachine();
            cookieMachine.setCookiePrototype(new StrawberryCookie());
        }

        when: {
            cookiePrototype1 = cookieMachine.makeCookie();
            cookiePrototype2 = cookieMachine.makeCookie();
        }

        then: {
            assertThat(cookiePrototype1).isNotEqualTo(cookiePrototype2);
            assertThat(cookiePrototype1.getName()).isEqualTo("strawberryCookie");
            assertThat(cookiePrototype2.getName()).isEqualTo("strawberryCookie");
        }
    }

}
