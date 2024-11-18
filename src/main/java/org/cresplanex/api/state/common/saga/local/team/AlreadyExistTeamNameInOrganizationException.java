package org.cresplanex.api.state.common.saga.local.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.TeamServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.util.List;

public class AlreadyExistTeamNameInOrganizationException extends LocalException {

    public AlreadyExistTeamNameInOrganizationException(String organizationId, List<String> names) {
        super(
                TeamServiceApplicationCode.ALREADY_EXIST_TEAM_NAME_IN_ORGANIZATION,
                "Duplicated team name: " + names.stream().reduce("", (a, b) -> a + ", " + b) + " in organization: " + organizationId,
                new Data(organizationId, names),
                "Duplicated team name: " + names.stream().reduce("", (a, b) -> a + ", " + b) + " in organization: " + organizationId
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "ALREADY_EXIST_TEAM_NAME_IN_ORGANIZATION";
        private String organizationId;
        private List<String> names;

        public Data(String organizationId, List<String> names) {
            this.organizationId = organizationId;
            this.names = names;
        }
    }
}
