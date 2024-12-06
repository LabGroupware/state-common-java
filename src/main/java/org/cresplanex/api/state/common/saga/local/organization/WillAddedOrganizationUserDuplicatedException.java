package org.cresplanex.api.state.common.saga.local.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.OrganizationServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.util.List;

public class WillAddedOrganizationUserDuplicatedException extends LocalException {

    public WillAddedOrganizationUserDuplicatedException(List<String> userIds) {
        super(
                OrganizationServiceApplicationCode.WILL_ADDED_USER_DUPLICATED,
                "Will added organization user duplicated: " + userIds.stream().reduce("", (a, b) -> a + ", " + b),
                new Data(userIds),
                "Will added organization user duplicated: " + userIds.stream().reduce("", (a, b) -> a + ", " + b)
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
