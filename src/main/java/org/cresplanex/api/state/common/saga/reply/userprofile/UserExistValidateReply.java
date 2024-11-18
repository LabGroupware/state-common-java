package org.cresplanex.api.state.common.saga.reply.userprofile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.saga.reply.BaseFailureReply;
import org.cresplanex.api.state.common.saga.reply.BaseSuccessfullyReply;
import org.cresplanex.api.state.common.saga.validate.userprofile.UserExistValidateCommand;

import java.util.List;

public class UserExistValidateReply {

    private static final String PREFIX = UserExistValidateCommand.TYPE + ".Reply.";

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
        public static class UserNotFound {
            private String expectedFailure = "USER_NOT_FOUND";
            private List<String> userIds;

            public UserNotFound(List<String> userIds) {
                this.userIds = userIds;
            }
        }

        @Override
        public String getType() {
            return TYPE;
        }
    }
}
