package org.cresplanex.api.state.common.event.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cresplanex.core.events.common.DomainEvent;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FailedJobEvent implements DomainEvent {

    private String jobId;
    private Object data;
    private String actionCode;
    private String internalCode;
    private String internalCaption;
    private String timestamp;
    private Object endedErrorAttributes;
}
