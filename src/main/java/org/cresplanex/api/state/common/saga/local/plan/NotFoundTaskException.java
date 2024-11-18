package org.cresplanex.api.state.common.saga.local.plan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.PlanServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.util.List;

public class NotFoundTaskException extends LocalException {

    public NotFoundTaskException(List<String> taskIds) {
        super(
                PlanServiceApplicationCode.TASK_NOT_FOUND,
                "Task not found: " + taskIds.stream().reduce("", (a, b) -> a + ", " + b),
                new Data(taskIds),
                "Task not found: " + taskIds.stream().reduce("", (a, b) -> a + ", " + b)
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "NOT_FOUND_TASK";
        private List<String> taskIds;

        public Data(List<String> taskIds) {
            this.taskIds = taskIds;
        }
    }
}
