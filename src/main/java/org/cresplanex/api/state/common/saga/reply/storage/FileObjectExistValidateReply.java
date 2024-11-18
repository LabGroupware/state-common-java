package org.cresplanex.api.state.common.saga.reply.storage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.saga.reply.BaseFailureReply;
import org.cresplanex.api.state.common.saga.reply.BaseSuccessfullyReply;
import org.cresplanex.api.state.common.saga.validate.storage.FileObjectExistValidateCommand;

import java.util.List;

public class FileObjectExistValidateReply {

    private static final String PREFIX = FileObjectExistValidateCommand.TYPE + ".Reply.";

    public static class Success extends BaseSuccessfullyReply<Object> {
        public static final String TYPE = PREFIX + "Success";

        public Success(Object data, String code, String caption, String timestamp) {
            super(data, code, caption, timestamp);
        }

        public Success() {
        }

        @Override
        public String getType() {
            return TYPE;
        }
    }

    public static class Failure extends BaseFailureReply<Object> {
        public static final String TYPE = PREFIX + "Failure";

        public Failure(Object data, String code, String caption, String timestamp) {
            super(data, code, caption, timestamp);
        }

        public Failure() {
        }

        @AllArgsConstructor
        @NoArgsConstructor
        @Getter
        public static class FileObjectNotFound {
            private String expectedFailure = "FILE_OBJECT_NOT_FOUND";
            private List<String> fileObjectIds;

            public FileObjectNotFound(List<String> fileObjectIds) {
                this.fileObjectIds = fileObjectIds;
            }
        }

        @Override
        public String getType() {
            return TYPE;
        }
    }
}
