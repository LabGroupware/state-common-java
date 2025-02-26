package org.cresplanex.api.state.common.saga.command.plan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.saga.type.PlanSagaType;

import java.util.List;

public class CreateTaskAndAttachInitialFIleObjectsCommand {

    public static final String PREFIX = PlanSagaType.CREATE_TASK + ".Command.CreateTaskAndAttachInitialFIleObjects.";

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Exec extends PlanSagaCommand {
        public static final String TYPE = PREFIX + "Exec";

        private String operatorId;
        private String teamId;
        private String chargeUserId;
        private String title;
        private String description;
        private String startDatetime;
        private String dueDatetime;
        private List<FileObject> attachmentFileObjectIds;

        @AllArgsConstructor
        @NoArgsConstructor
        @Getter
        public static class FileObject {
            private String fileObjectId;
        }
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Undo extends PlanSagaCommand {
        public static final String TYPE = PREFIX + "Undo";

        private String taskId;
    }
}
