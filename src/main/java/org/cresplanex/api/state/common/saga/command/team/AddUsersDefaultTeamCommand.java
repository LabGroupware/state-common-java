package org.cresplanex.api.state.common.saga.command.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.dto.team.UserOnTeamDto;
import org.cresplanex.api.state.common.saga.type.OrganizationSagaType;

import java.util.List;

public class AddUsersDefaultTeamCommand {

    public static final String PREFIX = OrganizationSagaType.ADD_USERS_TO_ORGANIZATION + ".Command.AddUsersDefaultTeam.";

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Exec extends TeamSagaCommand {
        public static final String TYPE = PREFIX + "Exec";

        private String operatorId;
        private String organizationId;
        private List<UserOnTeamDto> users;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Undo extends TeamSagaCommand {
        public static final String TYPE = PREFIX + "Undo";

        private List<String> userTeamIds;
    }
}
