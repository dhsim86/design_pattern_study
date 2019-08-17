package com.dongho.df.domain.structural.bridge;

import com.dongho.df.domain.structural.bridge.impl.ConsoleLoginManagerImplFactory;
import com.dongho.df.domain.structural.bridge.impl.WebLoginManagerImplFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class BridgeTest {

    @Test
    public void WebLoginManagerImplTest() {
        ExtendLoginManager extendLoginManager;
        boolean isAuthenticatedResult;
        boolean isExistResult;
        boolean changePasswordResult;

        given: {
            extendLoginManager = new ExtendLoginManager(new WebLoginManagerImplFactory());
        }

        when: {
            isAuthenticatedResult = extendLoginManager.isAuthenticated("user", "pass");
            isExistResult = extendLoginManager.isExist("user");
            changePasswordResult = extendLoginManager.changePassword("user", "pass", "newPass");
        }

        then: {
            assertThat(isAuthenticatedResult).isTrue();
            assertThat(isExistResult).isTrue();
            assertThat(changePasswordResult).isTrue();
        }
    }

    @Test
    public void ConsoleLoginManagerImplTest() {
        ExtendLoginManager extendLoginManager;
        boolean isAuthenticatedResult;
        boolean isExistResult;
        boolean changePasswordResult;

        given: {
            extendLoginManager = new ExtendLoginManager(new ConsoleLoginManagerImplFactory());
        }

        when: {
            isAuthenticatedResult = extendLoginManager.isAuthenticated("user", "pass");
            isExistResult = extendLoginManager.isExist("user");
            changePasswordResult = extendLoginManager.changePassword("user", "pass", "newPass");
        }

        then: {
            assertThat(isAuthenticatedResult).isFalse();
            assertThat(isExistResult).isFalse();
            assertThat(changePasswordResult).isFalse();
        }
    }

}
