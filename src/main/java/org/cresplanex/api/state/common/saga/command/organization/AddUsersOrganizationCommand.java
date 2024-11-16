package org.cresplanex.api.state.common.saga.command.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.dto.organization.UserOnOrganizationDto;
import org.cresplanex.api.state.common.saga.type.OrganizationSagaType;

import java.util.List;

public class AddUsersOrganizationCommand {

    public static final String PREFIX = OrganizationSagaType.ADD_USERS_TO_ORGANIZATION + ".Command.AddUsersOrganization.";

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Exec extends OrganizationSagaCommand {
        public static final String TYPE = PREFIX + "Exec";

        private String operatorId;
        private String organizationId;
        private List<UserOnOrganizationDto> users;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Undo extends OrganizationSagaCommand {
        public static final String TYPE = PREFIX + "Undo";

        private List<String> userOrganizationIds;
    }
}
