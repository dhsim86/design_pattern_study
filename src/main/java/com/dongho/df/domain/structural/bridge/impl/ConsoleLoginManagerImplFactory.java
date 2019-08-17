package com.dongho.df.domain.structural.bridge.impl;

public class ConsoleLoginManagerImplFactory extends LoginManagerImplFactory {

    @Override
    public LoginManagerImpl createLoginManagerImpl() {
        return new ConsoleLoginManager();
    }

}
