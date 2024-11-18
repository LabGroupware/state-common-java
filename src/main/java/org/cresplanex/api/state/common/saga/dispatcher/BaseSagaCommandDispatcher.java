package org.cresplanex.api.state.common.saga.dispatcher;

public abstract class BaseSagaCommandDispatcher {

    public String getDispatcherId(String sagaCommandChannel) {
        return getDispatcherId(sagaCommandChannel, "Primitive");
    }

    public String getDispatcherId(String sagaCommandChannel, String aggregateType) {
        return "%s.SagaCommandDispatcher.%s".formatted(sagaCommandChannel, aggregateType);
    }
}
