package org.cresplanex.api.state.common.saga.reply.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.cresplanex.api.state.common.saga.reply.BaseFailureReply;
import org.cresplanex.api.state.common.saga.reply.BaseSuccessfullyReply;
import org.cresplanex.api.state.common.saga.validate.organization.OrganizationAndOrganizationUserExistValidateCommand;

import java.util.List;

public class OrganizationAndOrganizationUserExistValidateReply {

    private static final String PREFIX = OrganizationAndOrganizationUserExistValidateCommand.TYPE + ".Reply.";

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
        public static class OrganizationUserNotFound {
            private String expectedFailure = "ORGANIZATION_USER_NOT_FOUND";
            private List<String> userIds;

            public OrganizationUserNotFound(List<String> userIds) {
                this.userIds = userIds;
            }
        }

        @AllArgsConstructor
        @NoArgsConstructor
        @Getter
        public static class OrganizationNotFound {
            private String expectedFailure = "ORGANIZATION_NOT_FOUND";
            private String organizationId;

            public OrganizationNotFound(String organizationId) {
                this.organizationId = organizationId;
            }
        }

        @Override
        public String getType() {
            return TYPE;
        }
    }
}
