package org.cresplanex.api.state.common.saga.data.plan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.dto.plan.TaskDto;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateStatusTaskResultData {
    private TaskDto task;
}
