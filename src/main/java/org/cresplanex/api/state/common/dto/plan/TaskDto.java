package org.cresplanex.api.state.common.dto.plan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TaskDto {

    private String taskId;

    private String teamId;

    private String chargeUserId;

    private String title;

    private String description;

    private String status;

    private String startDateTime;

    private String dueDateTime;
}
