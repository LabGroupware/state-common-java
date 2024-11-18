package org.cresplanex.api.state.common.saga.local.plan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.PlanServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.time.LocalDateTime;

public class InvalidStartDateTimeException extends LocalException {

    public InvalidStartDateTimeException(String startTime) {
        super(
                PlanServiceApplicationCode.TASK_INVALID_START_TIME,
                "Invalid start time: " + startTime,
                new Data(startTime),
                "Invalid start time: " + startTime
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "INVALID_START_TIME";
        private String startTime;

        public Data(String startTime) {
            this.startTime = startTime;
        }
    }
}
