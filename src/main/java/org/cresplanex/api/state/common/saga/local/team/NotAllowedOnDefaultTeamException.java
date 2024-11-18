package org.cresplanex.api.state.common.saga.local.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.TeamServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.util.List;

public class NotAllowedOnDefaultTeamException extends LocalException {

    public NotAllowedOnDefaultTeamException(List<String> organizationIds, String ActionType) {
        super(
                TeamServiceApplicationCode.NOT_ALLOWED_ON_DEFAULT_TEAM,
                "Not allowed action: " + ActionType + " on default team in organization: " + organizationIds.stream().reduce("", (a, b) -> a + ", " + b),
                new Data(organizationIds, ActionType),
                "Not allowed action: " + ActionType + " on default team in organization: " + organizationIds.stream().reduce("", (a, b) -> a + ", " + b)
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "NOT_ALLOWED_ON_DEFAULT_TEAM";
        private List<String> organizationIds;
        private String ActionType;

        public Data(List<String> organizationIds, String ActionType) {
            this.organizationIds = organizationIds;
            this.ActionType = ActionType;
        }
    }
}
