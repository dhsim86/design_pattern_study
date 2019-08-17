package com.dongho.df.domain.structural.bridge;

import com.dongho.df.domain.structural.bridge.impl.LoginManagerImplFactory;

public class ExtendLoginManager extends LoginManager {

    public ExtendLoginManager(LoginManagerImplFactory factory) {
        super(factory);
    }

    public boolean changePassword(String userName, String password, String newPassword) {
        if (isAuthenticated(userName, password)) {
            System.out.println("changePassword: " + newPassword);
            return true;
        }
        return false;
    }

}
