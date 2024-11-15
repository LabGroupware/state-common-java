package org.cresplanex.api.state.common.saga.data.storage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.dto.storage.FileObjectDto;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateFileObjectResultData {
    private FileObjectDto fileObject;
}
