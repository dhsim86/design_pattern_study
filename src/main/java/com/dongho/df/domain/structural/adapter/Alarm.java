package com.dongho.df.domain.structural.adapter;

import java.io.File;

public interface Alarm {

    void sendText(String text);
    void sendMessage(File image);

}
