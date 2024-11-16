package org.cresplanex.api.state.common.saga.reply.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.dto.organization.OrganizationDto;
import org.cresplanex.api.state.common.dto.organization.UserOnOrganizationDto;
import org.cresplanex.api.state.common.saga.command.organization.CreateOrganizationAndAddInitialOrganizationUserCommand;
import org.cresplanex.api.state.common.saga.reply.BaseFailureReply;
import org.cresplanex.api.state.common.saga.reply.BaseSuccessfullyReply;

import java.util.List;

public class CreateOrganizationAndAddInitialOrganizationUserReply {

    private static final String EXEC_PREFIX = CreateOrganizationAndAddInitialOrganizationUserCommand.Exec.TYPE + ".Reply.";

    public static class Success extends BaseSuccessfullyReply<Success.Data> {
        public static final String TYPE = EXEC_PREFIX + "Success";

        public Success(Data data, String code, String caption, String timestamp) {
            super(data, code, caption, timestamp);
        }

        public Success() {
        }

        @AllArgsConstructor
        @NoArgsConstructor
        @Getter
        public static class Data {
            private OrganizationDto organization;
            private List<UserOnOrganizationDto> users;
        }

        @Override
        public String getType() {
            return TYPE;
        }
    }

    public static class Failure extends BaseFailureReply<Object> {
        public static final String TYPE = EXEC_PREFIX + "Failure";

        public Failure(Object data, String code, String caption, String timestamp) {
            super(data, code, caption, timestamp);
        }

        public Failure() {
        }

        @Override
        public String getType() {
            return TYPE;
        }
    }
}
