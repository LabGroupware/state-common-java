package org.cresplanex.api.state.common.saga.command.plan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.saga.type.PlanSagaType;

import java.util.List;

public class UpdateStatusTaskCommand {

    public static final String PREFIX = PlanSagaType.UPDATE_TASK_STATUS + ".Command.UpdateStatusTask.";

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Exec extends PlanSagaCommand {
        public static final String TYPE = PREFIX + "Exec";

        private String operatorId;
        private String taskId;
        private String status;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Undo extends PlanSagaCommand {
        public static final String TYPE = PREFIX + "Undo";

        private String taskId;
        private String originStatus;
    }
}
