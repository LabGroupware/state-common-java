package org.cresplanex.api.state.common.dto.plan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TaskWithAttachmentsDto {

    private TaskDto task;

    private List<FileObjectOnTaskDto> attachments;
}
