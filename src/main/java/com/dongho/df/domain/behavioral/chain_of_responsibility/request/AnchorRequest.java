package com.dongho.df.domain.behavioral.chain_of_responsibility.request;

public class AnchorRequest implements Request {

    @Override
    public RequestType getRequestType() {
        return RequestType.ANCHOR_CLICK;
    }

}
