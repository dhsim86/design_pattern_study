package com.dongho.df.domain.behavioral.chain_of_responsibility;

import com.dongho.df.domain.behavioral.chain_of_responsibility.handler.AnchorChainHandler;
import com.dongho.df.domain.behavioral.chain_of_responsibility.handler.ButtonChainHandler;
import com.dongho.df.domain.behavioral.chain_of_responsibility.handler.ChainHandler;
import com.dongho.df.domain.behavioral.chain_of_responsibility.request.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class ChainOfResponsibilityTest {

    private ChainHandler root;

    @Before
    public void before() {
        ChainHandler buttonChainHandler = new ButtonChainHandler();
        ChainHandler anchorChainHandler = new AnchorChainHandler();

        buttonChainHandler.linkDelegator(anchorChainHandler);
        root = buttonChainHandler;
    }


    @Test
    public void buttonClickRequestTest() {
        Request request;
        ResultSet resultSet;

        given: {
            request = new ButtonRequest();
        }

        when: {
            resultSet = root.handleRequest(request);
        }

        then: {
            assertThat(resultSet.getValue()).isEqualTo(RequestType.BUTTON_CLICK.name());
        }
    }


    @Test
    public void anchorClickRequest() {
        Request request;
        ResultSet resultSet;

        given: {
            request = new AnchorRequest();
        }

        when: {
            resultSet = root.handleRequest(request);
        }

        then: {
            assertThat(resultSet.getValue()).isEqualTo(RequestType.ANCHOR_CLICK.name());
        }
    }


    @Test
    public void linkClickRequestDefault() {
        Request request;
        ResultSet resultSet;

        given: {
            request = new LinkRequest();
        }

        when: {
            resultSet = root.handleRequest(request);
        }

        then: {
            assertThat(resultSet.getValue()).isEqualTo("");
        }
    }


}
