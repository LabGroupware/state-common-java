package org.cresplanex.api.state.common.saga.local.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.OrganizationServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.util.List;

public class InvalidOrganizationPlanException extends LocalException {

    public InvalidOrganizationPlanException(List<String> plans) {
        super(
                OrganizationServiceApplicationCode.INVALID_PLAN,
                "Invalid organization plan: " + plans.stream().reduce("", (a, b) -> a + ", " + b),
                new Data(plans),
                "Invalid organization plan: " + plans.stream().reduce("", (a, b) -> a + ", " + b)
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "INVALID_PLAN";
        private List<String> plans;

        public Data(List<String> plans) {
            this.plans = plans;
        }
    }
}
