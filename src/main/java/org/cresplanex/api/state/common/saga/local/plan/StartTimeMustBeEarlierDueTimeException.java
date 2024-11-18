package org.cresplanex.api.state.common.saga.local.plan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.PlanServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.time.LocalDateTime;
import java.util.List;

public class StartTimeMustBeEarlierDueTimeException extends LocalException {

    public StartTimeMustBeEarlierDueTimeException(LocalDateTime startTime, LocalDateTime dueTime) {
        super(
                PlanServiceApplicationCode.TASK_START_TIME_MUST_BE_EARLIER_DUE_TIME,
                "Start time: " + startTime + " must be earlier than due time: " + dueTime,
                new Data(startTime.toString(), dueTime.toString()),
                "Start time: " + startTime + " must be earlier than due time: " + dueTime
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "START_TIME_MUST_BE_EARLIER_DUE_TIME";
        private String startTime;
        private String dueTime;

        public Data(String startTime, String dueTime) {
            this.startTime = startTime;
            this.dueTime = dueTime;
        }
    }
}
