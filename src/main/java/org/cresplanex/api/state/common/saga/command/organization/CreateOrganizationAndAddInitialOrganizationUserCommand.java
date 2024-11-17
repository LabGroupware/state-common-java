package org.cresplanex.api.state.common.saga.command.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.saga.type.OrganizationSagaType;

import java.util.List;

public class CreateOrganizationAndAddInitialOrganizationUserCommand {

    public static final String PREFIX = OrganizationSagaType.CREATE_ORGANIZATION + ".Command.CreateOrganizationAndAddInitialOrganizationUser.";

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Exec extends OrganizationSagaCommand {
        public static final String TYPE = PREFIX + "Exec";

        private String operatorId;
        private String name;
        private String plan;
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
    public static class Undo extends OrganizationSagaCommand {
        public static final String TYPE = PREFIX + "Undo";

        private String organizationId;
    }
}
