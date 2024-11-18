package org.cresplanex.api.state.common.saga.local.plan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.OrganizationServiceApplicationCode;
import org.cresplanex.api.state.common.constants.PlanServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.util.List;

public class InvalidTaskStatusException extends LocalException {

    public InvalidTaskStatusException(List<String> status) {
        super(
                PlanServiceApplicationCode.INVALID_STATUS,
                "Invalid task status: " + status.stream().reduce("", (a, b) -> a + ", " + b),
                new Data(status),
                "Invalid task status: " + status.stream().reduce("", (a, b) -> a + ", " + b)
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "INVALID_STATUS";
        private List<String> status;

        public Data(List<String> status) {
            this.status = status;
        }
    }
}
