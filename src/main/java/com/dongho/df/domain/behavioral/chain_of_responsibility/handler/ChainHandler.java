package com.dongho.df.domain.behavioral.chain_of_responsibility.handler;

import com.dongho.df.domain.behavioral.chain_of_responsibility.ResultSet;
import com.dongho.df.domain.behavioral.chain_of_responsibility.request.Request;

public abstract class ChainHandler {

    private ChainHandler chainHandler = null;

    public abstract ResultSet handleRequest(Request request);

    public void linkDelegator(ChainHandler handler) {
        chainHandler = handler;
    }

    protected ResultSet delegateRequest(Request request) {
        if (chainHandler == null) {
            return new ResultSet("");
        }

        return chainHandler.handleRequest(request);
    }

}
