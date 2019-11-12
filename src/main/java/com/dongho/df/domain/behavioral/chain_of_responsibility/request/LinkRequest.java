package com.dongho.df.domain.behavioral.chain_of_responsibility.request;

public class LinkRequest implements Request {

    @Override
    public RequestType getRequestType() {
        return RequestType.LINK_CLICK;
    }

}
