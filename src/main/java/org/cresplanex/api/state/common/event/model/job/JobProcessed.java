package org.cresplanex.api.state.common.event.model.job;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.ServiceType;
import org.cresplanex.api.state.common.dto.JobDto;
import org.cresplanex.api.state.common.event.model.BaseEvent;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobProcessed implements JobDomainEvent, BaseEvent {
    public static final String TYPE = ServiceType.NOVA_JOB
            + ".Event.Job.Processed";

    private String jobId;
    private String jobEventType;
    private String pendingAction;
    private List<JobDto.JobActionDto> completedActions;
    private List<String> scheduledActions;
    private String timestamp;

    public String getType() {
        return TYPE;
    }
}
