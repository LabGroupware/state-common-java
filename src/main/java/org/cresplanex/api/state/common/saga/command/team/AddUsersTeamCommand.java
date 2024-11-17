package org.cresplanex.api.state.common.saga.command.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.saga.type.TeamSagaType;

import java.util.List;

public class AddUsersTeamCommand {

    public static final String PREFIX = TeamSagaType.ADD_USERS_TO_TEAM + ".Command.AddUsersTeam.";

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Exec extends TeamSagaCommand {
        public static final String TYPE = PREFIX + "Exec";

        private String operatorId;
        private String teamId;
        private List<User> users;

        public static class User {
            private String userId;
        }
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Undo extends TeamSagaCommand {
        public static final String TYPE = PREFIX + "Undo";

        private List<String> userTeamIds;
    }
}
