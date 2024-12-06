package org.cresplanex.api.state.common.saga.local.plan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.PlanServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.util.List;

public class WillAddedTaskAttachmentsDuplicatedException extends LocalException {

    public WillAddedTaskAttachmentsDuplicatedException(List<String> attachmentIds) {
        super(
                PlanServiceApplicationCode.WILL_ADDED_TASK_ATTACHMENTS_DUPLICATED,
                "Will added task attachments duplicated: " + attachmentIds.stream().reduce("", (a, b) -> a + ", " + b),
                new Data(attachmentIds),
                "Will added task attachments duplicated: " + attachmentIds.stream().reduce("", (a, b) -> a + ", " + b)
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "WILL_ADDED_TASK_ATTACHMENTS_DUPLICATED";
        private List<String> attachmentIds;

        public Data(List<String> attachmentIds) {
            this.attachmentIds = attachmentIds;
        }
    }
}
