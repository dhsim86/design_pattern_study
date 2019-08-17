package com.dongho.df.domain.structural.bridge.impl;

public interface LoginManagerImpl {

    boolean validate(String userName, String password);
    boolean checkDuplicatedUserName(String userName);

}
