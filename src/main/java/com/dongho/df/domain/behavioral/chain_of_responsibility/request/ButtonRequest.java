package com.dongho.df.domain.behavioral.chain_of_responsibility.request;

public class ButtonRequest implements Request {

    @Override
    public RequestType getRequestType() {
        return RequestType.BUTTON_CLICK;
    }

}
