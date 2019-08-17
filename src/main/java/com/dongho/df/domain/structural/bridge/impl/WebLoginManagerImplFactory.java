package com.dongho.df.domain.structural.bridge.impl;

public class WebLoginManagerImplFactory extends LoginManagerImplFactory {

    @Override
    public LoginManagerImpl createLoginManagerImpl() {
        return new WebLoginManager();
    }

}
