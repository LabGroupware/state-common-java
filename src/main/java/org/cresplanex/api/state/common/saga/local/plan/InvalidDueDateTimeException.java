package org.cresplanex.api.state.common.saga.local.plan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.PlanServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

public class InvalidDueDateTimeException extends LocalException {

    public InvalidDueDateTimeException(String dueTime) {
        super(
                PlanServiceApplicationCode.TASK_INVALID_DUE_TIME,
                "Invalid due time: " + dueTime,
                new Data(dueTime),
                "Invalid due time: " + dueTime
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "INVALID_DUE_TIME";
        private String dueTime;

        public Data(String dueTime) {
            this.dueTime = dueTime;
        }
    }
}
