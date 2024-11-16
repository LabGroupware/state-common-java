package org.cresplanex.api.state.common.saga.dispatcher;

public abstract class BaseSagaCommandDispatcher {

    public String getDispatcherId(String sagaCommandChannel) {
        return "%s.SagaCommandDispatcher".formatted(sagaCommandChannel);
    }
}
