package com.dongho.df.domain.structural.adapter;

import java.io.File;

public class SmsAlarm implements Alarm {

    private SmsTransferLib smsTransferLib;

    public SmsAlarm(SmsTransferLib smsTransferLib) {
        this.smsTransferLib = smsTransferLib;
    }

    @Override
    public void sendText(String text) {
        smsTransferLib.sendMessage(text.toCharArray());
    }

    @Override
    public void sendMessage(File image) {
        smsTransferLib.sendMessage("".toCharArray(), image);
    }

}
