package com.dongho.df.domain.structural.adapter;

import java.io.File;

public class SmsTransferLib {

    public void sendMessage(char[] message) {
        System.out.println(message);
    }

    public void sendMessage(char [] message, File image) {
        System.out.println(message + image.getName());
    }

}
