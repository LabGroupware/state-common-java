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

    public static class Success extends BaseSuccessfullyReply<FileObjectExistValidateReply.Success.Data> {
        public static final String TYPE = PREFIX + "Success";

        public Success(FileObjectExistValidateReply.Success.Data data, String code, String caption, String timestamp) {
            super(data, code, caption, timestamp);
        }

        public Success() {
        }

        @AllArgsConstructor
        @NoArgsConstructor
        @Getter
        public static class Data {
        }

        @Override
        public String getType() {
            return TYPE;
        }
    }

    public static class Failure extends BaseFailureReply<FileObjectExistValidateReply.Failure.Data> {
        public static final String TYPE = PREFIX + "Failure";

        public Failure(FileObjectExistValidateReply.Failure.Data data, String code, String caption, String timestamp) {
            super(data, code, caption, timestamp);
        }

        public Failure() {
        }

        @AllArgsConstructor
        @NoArgsConstructor
        @Getter
        public static class Data {
            private List<String> fileObjectIds;
        }

        @Override
        public String getType() {
            return TYPE;
        }
    }
}
