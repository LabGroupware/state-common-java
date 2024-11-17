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

    public static class Success extends BaseSuccessfullyReply<TeamExistValidateReply.Success.Data> {
        public static final String TYPE = PREFIX + "Success";

        public Success(TeamExistValidateReply.Success.Data data, String code, String caption, String timestamp) {
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

    public static class Failure extends BaseFailureReply<TeamExistValidateReply.Failure.Data> {
        public static final String TYPE = PREFIX + "Failure";

        public Failure(TeamExistValidateReply.Failure.Data data, String code, String caption, String timestamp) {
            super(data, code, caption, timestamp);
        }

        public Failure() {
        }

        @AllArgsConstructor
        @NoArgsConstructor
        @Getter
        public static class Data {
            private List<String> teamIds;
        }

        @Override
        public String getType() {
            return TYPE;
        }
    }
}
