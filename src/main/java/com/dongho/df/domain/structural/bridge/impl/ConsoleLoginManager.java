package com.dongho.df.domain.structural.bridge.impl;

public class ConsoleLoginManager implements LoginManagerImpl {

    @Override
    public boolean validate(String userName, String password) {
        System.out.println("ConsoleLoginManager validate");
        return false;
    }

    @Override
    public boolean checkDuplicatedUserName(String userName) {
        System.out.println("ConsoleLoginManager checkDuplicatedUserName");
        return false;
    }

}
