package org.cresplanex.api.state.common.saga.local.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.TeamServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.util.List;

public class NotFoundTeamException extends LocalException {

    public NotFoundTeamException(List<String> teamIds) {
        super(
                TeamServiceApplicationCode.NOT_FOUND,
                "Team not found: " + teamIds.stream().reduce("", (a, b) -> a + ", " + b),
                new Data(teamIds),
                "Team not found: " + teamIds.stream().reduce("", (a, b) -> a + ", " + b)
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "NOT_FOUND_TEAM";
        private List<String> teamIds;

        public Data(List<String> teamIds) {
            this.teamIds = teamIds;
        }
    }
}
