package org.cresplanex.api.state.common.saga.reply.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.saga.reply.BaseFailureReply;
import org.cresplanex.api.state.common.saga.reply.BaseSuccessfullyReply;
import org.cresplanex.api.state.common.saga.validate.team.TeamExistValidateCommand;

import java.util.List;

public class TeamExistValidateReply {

    private static final String PREFIX = TeamExistValidateCommand.TYPE + ".Reply.";

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
        public static class TeamNotFound {
            private String expectedFailure = "TEAM_NOT_FOUND";
            private List<String> teamIds;

            public TeamNotFound(List<String> teamIds) {
                this.teamIds = teamIds;
            }
        }

        @Override
        public String getType() {
            return TYPE;
        }
    }
}
