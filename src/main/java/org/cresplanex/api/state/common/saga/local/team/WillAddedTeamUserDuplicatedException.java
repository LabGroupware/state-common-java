package org.cresplanex.api.state.common.saga.local.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.TeamServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.util.List;

public class WillAddedTeamUserDuplicatedException extends LocalException {

    public WillAddedTeamUserDuplicatedException(List<String> userIds) {
        super(
                TeamServiceApplicationCode.WILL_ADDED_USER_DUPLICATED,
                "Will added team user duplicated: " + userIds.stream().reduce("", (a, b) -> a + ", " + b),
                new Data(userIds),
                "Will added team user duplicated: " + userIds.stream().reduce("", (a, b) -> a + ", " + b)
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "WILL_ADDED_USER_DUPLICATED";
        private List<String> userIds;

        public Data(List<String> userIds) {
            this.userIds = userIds;
        }
    }
}
