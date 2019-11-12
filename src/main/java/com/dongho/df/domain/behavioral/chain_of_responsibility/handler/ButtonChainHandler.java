package com.dongho.df.domain.behavioral.chain_of_responsibility.handler;

import com.dongho.df.domain.behavioral.chain_of_responsibility.ResultSet;
import com.dongho.df.domain.behavioral.chain_of_responsibility.request.Request;
import com.dongho.df.domain.behavioral.chain_of_responsibility.request.RequestType;

public class ButtonChainHandler extends ChainHandler {

    @Override
    public ResultSet handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.BUTTON_CLICK)) {
            return new ResultSet(RequestType.BUTTON_CLICK.name());
        }
        return delegateRequest(request);
    }

}
