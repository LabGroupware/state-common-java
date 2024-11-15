package org.cresplanex.api.state.common.event.subscriber;

public abstract class BaseSubscriber {

    protected String getDispatcherId(String selfServiceType, String aggregateType) {
        return "%s.EventListener.%s".formatted(selfServiceType, aggregateType);
    }
}
