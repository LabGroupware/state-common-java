package org.cresplanex.api.state.common.event.publisher;

import lombok.Getter;
import org.cresplanex.api.state.common.entity.BaseEntity;
import org.cresplanex.core.events.aggregates.AbstractAggregateDomainEventPublisher;
import org.cresplanex.core.events.common.DomainEvent;
import org.cresplanex.core.events.publisher.DomainEventPublisher;

@Getter
public abstract class AggregateDomainEventPublisher<T extends BaseEntity, U extends DomainEvent> extends AbstractAggregateDomainEventPublisher<T, U> {

    private final String aggregateType;

    public AggregateDomainEventPublisher(DomainEventPublisher eventPublisher, Class<T> entityClass, String aggregateType) {
        super(eventPublisher, entityClass, BaseEntity::getId, aggregateType);
        this.aggregateType = aggregateType;
    }
}