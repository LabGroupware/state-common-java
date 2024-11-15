package org.cresplanex.api.state.common.saga.dispatcher;

public abstract class BaseSagaCommandDispatcher {

    public String getDispatcherId(String selfServiceType, String sagaCommandChannel) {
        return "%s.SagaCommandDispatcher.%s".formatted(selfServiceType, sagaCommandChannel);
    }
}
