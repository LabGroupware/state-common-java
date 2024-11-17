package org.cresplanex.api.state.common.dto.plan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FileObjectOnTaskDto {

    public static FileObjectOnTaskDto empty() {
        return new FileObjectOnTaskDto();
    }

    private String taskAttachmentId;

    private String fileObjectId;
}
