package org.cresplanex.api.state.common.event.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cresplanex.core.events.common.DomainEvent;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessJobEvent implements DomainEvent {

    private String jobId;
    private Object endedData;
}
