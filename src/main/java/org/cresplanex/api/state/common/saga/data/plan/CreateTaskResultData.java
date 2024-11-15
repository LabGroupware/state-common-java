package org.cresplanex.api.state.common.saga.data.plan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.dto.plan.TaskDto;
import org.cresplanex.api.state.common.dto.storage.FileObjectDto;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateTaskResultData {
    private TaskDto task;
}
