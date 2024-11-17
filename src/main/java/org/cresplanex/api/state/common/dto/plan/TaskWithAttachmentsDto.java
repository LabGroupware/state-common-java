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

    public static TaskWithAttachmentsDto empty() {
        TaskDto task = TaskDto.empty();
        List<FileObjectOnTaskDto> attachments = List.of();
        return new TaskWithAttachmentsDto(task, attachments);
    }

    private TaskDto task;

    private List<FileObjectOnTaskDto> attachments;
}
