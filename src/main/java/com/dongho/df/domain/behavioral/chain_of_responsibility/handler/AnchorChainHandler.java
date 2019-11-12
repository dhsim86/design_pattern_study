package com.dongho.df.domain.behavioral.chain_of_responsibility.handler;

import com.dongho.df.domain.behavioral.chain_of_responsibility.ResultSet;
import com.dongho.df.domain.behavioral.chain_of_responsibility.request.Request;
import com.dongho.df.domain.behavioral.chain_of_responsibility.request.RequestType;

public class AnchorChainHandler extends ChainHandler {

    @Override
    public ResultSet handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.ANCHOR_CLICK)) {
            return new ResultSet(RequestType.ANCHOR_CLICK.name());
        }
        return delegateRequest(request);
    }
}
