package org.cresplanex.api.state.common.saga.command.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.saga.type.TeamSagaType;

import java.util.List;

public class CreateTeamAndAddInitialTeamUserCommand {

    public static final String PREFIX = TeamSagaType.CREATE_TEAM + ".Command.CreateTeamAndAddInitialTeamUser.";

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Exec extends TeamSagaCommand {
        public static final String TYPE = PREFIX + "Exec";

        private String operatorId;
        private String organizationId;
        private String name;
        private String description;
        private List<User> users;

        @AllArgsConstructor
        @NoArgsConstructor
        @Getter
        public static class User {
            private String userId;
        }
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Undo extends TeamSagaCommand {
        public static final String TYPE = PREFIX + "Undo";

        private String teamId;
    }
}
