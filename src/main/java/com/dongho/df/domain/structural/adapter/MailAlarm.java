package com.dongho.df.domain.structural.adapter;

import java.io.File;

public class MailAlarm implements Alarm {

    @Override
    public void sendText(String text) {
        System.out.println("send text");
    }

    @Override
    public void sendMessage(File image) {
        System.out.println("send " + image.getName());
    }

}
