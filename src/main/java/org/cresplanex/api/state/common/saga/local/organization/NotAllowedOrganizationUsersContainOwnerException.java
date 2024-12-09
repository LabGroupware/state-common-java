package org.cresplanex.api.state.common.saga.local.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.OrganizationServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.util.List;

public class NotAllowedOrganizationUsersContainOwnerException extends LocalException {

    public NotAllowedOrganizationUsersContainOwnerException(List<String> userIds, String ownerId) {
        super(
                OrganizationServiceApplicationCode.NOT_ALLOWED_USERS_CONTAIN_OWNER,
                "Not allowed organization users contain owner: " + userIds.stream().reduce("", (a, b) -> a + ", " + b),
                new Data(userIds, ownerId),
                "Not allowed organization users contain owner: " + userIds.stream().reduce("", (a, b) -> a + ", " + b)
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "NOT_ALLOWED_USERS_CONTAIN_OWNER";
        private List<String> userIds;
        private String ownerId;

        public Data(List<String> userIds, String ownerId) {
            this.userIds = userIds;
            this.ownerId = ownerId;
        }
    }
}