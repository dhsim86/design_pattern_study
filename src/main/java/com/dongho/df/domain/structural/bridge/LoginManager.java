package com.dongho.df.domain.structural.bridge;

import com.dongho.df.domain.structural.bridge.impl.LoginManagerImpl;
import com.dongho.df.domain.structural.bridge.impl.LoginManagerImplFactory;

public abstract class LoginManager {

    protected LoginManagerImpl loginManagerImpl;

    public LoginManager(LoginManagerImplFactory factory) {
        this.loginManagerImpl = factory.createLoginManagerImpl();
    }

    public boolean isAuthenticated(String userName, String password) {
        // default
        return loginManagerImpl.validate(userName, password);
    }

    public boolean isExist(String userName) {
        // default
        return loginManagerImpl.checkDuplicatedUserName(userName);
    }

}
