package org.cresplanex.api.state.common.dto.storage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FileObjectDto {

    private String fileObjectId;

    private String bucketId;

    private String name;

    private String path;

    private String mimeType;

    private Integer size;

    private String checksum;
}
