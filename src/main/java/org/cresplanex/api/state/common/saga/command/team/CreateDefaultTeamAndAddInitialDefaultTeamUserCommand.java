package org.cresplanex.api.state.common.saga.command.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.dto.team.UserOnTeamDto;
import org.cresplanex.api.state.common.saga.type.OrganizationSagaType;

import java.util.List;

public class CreateDefaultTeamAndAddInitialDefaultTeamUserCommand {

    public static final String PREFIX = OrganizationSagaType.CREATE_ORGANIZATION + ".Command.CreateDefaultTeamAndAddedInitialDefaultTeamUser.";

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Exec extends TeamSagaCommand {
        public static final String TYPE = PREFIX + "Exec";

        private String operatorId;
        private String organizationId;
        private String name;
        private String description;
        private List<UserOnTeamDto> users;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Undo extends TeamSagaCommand {
        public static final String TYPE = PREFIX + "Undo";

        private String teamId;
    }
}