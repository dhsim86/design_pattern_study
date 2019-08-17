package com.dongho.df.domain.structural.bridge.impl;

public class WebLoginManager implements LoginManagerImpl {

    @Override
    public boolean validate(String userName, String password) {
        System.out.println("WebLoginManager validate");
        return true;
    }

    @Override
    public boolean checkDuplicatedUserName(String userName) {
        System.out.println("WebLoginManager checkDuplicatedUserName");
        return true;
    }

}
