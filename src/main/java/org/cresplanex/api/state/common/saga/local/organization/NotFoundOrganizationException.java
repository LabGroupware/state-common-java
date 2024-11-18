package org.cresplanex.api.state.common.saga.local.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.OrganizationServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.util.List;

public class NotFoundOrganizationException extends LocalException {

    public NotFoundOrganizationException(List<String> organizationIds) {
        super(
                OrganizationServiceApplicationCode.NOT_FOUND,
                "Organization not found: " + organizationIds.stream().reduce("", (a, b) -> a + ", " + b),
                new Data(organizationIds),
                "Organization not found: " + organizationIds.stream().reduce("", (a, b) -> a + ", " + b)
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "NOT_FOUND_ORGANIZATION";
        private List<String> organizationIds;

        public Data(List<String> organizationIds) {
            this.organizationIds = organizationIds;
        }
    }
}
