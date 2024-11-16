package org.cresplanex.api.state.common.saga.validate.storage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.ServiceType;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FileObjectExistValidateCommand extends StorageSagaValidateCommand {

    public static final String TYPE = ServiceType.NOVA_STORAGE + ".Saga.ValidateCommand.FileObjectExist";

    private List<String> fileObjectIds;
    private boolean any;
}
