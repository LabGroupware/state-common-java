package org.cresplanex.api.state.common.saga.reply.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.saga.reply.BaseFailureReply;
import org.cresplanex.api.state.common.saga.reply.BaseSuccessfullyReply;
import org.cresplanex.api.state.common.saga.validate.organization.OrganizationUserExistValidateCommand;

import java.util.List;

public class OrganizationUserExistValidateReply {

    private static final String PREFIX = OrganizationUserExistValidateCommand.TYPE + ".Reply.";

    public static class Success extends BaseSuccessfullyReply<OrganizationUserExistValidateReply.Success.Data> {
        public static final String TYPE = PREFIX + "Success";

        public Success(OrganizationUserExistValidateReply.Success.Data data, String code, String caption, String timestamp) {
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

    public static class Failure extends BaseFailureReply<OrganizationUserExistValidateReply.Failure.Data> {
        public static final String TYPE = PREFIX + "Failure";

        public Failure(OrganizationUserExistValidateReply.Failure.Data data, String code, String caption, String timestamp) {
            super(data, code, caption, timestamp);
        }

        public Failure() {
        }

        @AllArgsConstructor
        @NoArgsConstructor
        @Getter
        public static class Data {
            private List<String> userIds;
        }

        @Override
        public String getType() {
            return TYPE;
        }
    }
}
