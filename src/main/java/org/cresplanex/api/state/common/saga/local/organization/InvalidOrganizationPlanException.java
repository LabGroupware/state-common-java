package org.cresplanex.api.state.common.saga.local.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.OrganizationServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

public class InvalidOrganizationPlanException extends LocalException {

    public InvalidOrganizationPlanException(String plan) {
        super(
                OrganizationServiceApplicationCode.INVALID_PLAN,
                "Invalid organization plan: " + plan,
                new Data(plan),
                "Invalid organization plan: " + plan
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String plan;
    }
}
