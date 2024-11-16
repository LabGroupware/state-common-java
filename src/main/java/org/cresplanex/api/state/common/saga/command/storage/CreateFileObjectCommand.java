package org.cresplanex.api.state.common.saga.command.storage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.saga.type.StorageSagaType;

public class CreateFileObjectCommand {

    public static final String PREFIX = StorageSagaType.CREATE_FILE_OBJECT + ".Command.CreateFileObject.";

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Exec extends StorageSagaCommand {
        public static final String TYPE = PREFIX + "Exec";

        private String operatorId;
        private String bucketId;
        private String name;
        private String path;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Undo extends StorageSagaCommand {
        public static final String TYPE = PREFIX + "Undo";

        private String fileObjectId;
    }
}
