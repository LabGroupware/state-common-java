package org.cresplanex.api.state.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobDto {
    private String jobId;
    private boolean initialized;
    private boolean success;
    private boolean process;
    private boolean isValid;
    private Object data;
    private List<String> scheduledActions;
    private String pendingAction;
    private List<JobActionDto> completedActions;
    private String code;
    private String caption;
    private Object errorAttributes;
    private String startedAt;
    private String expiredAt;
    private String completedAt;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JobActionDto {
        private String actionCode;
        private boolean success;
        private Object data;
        private String code;
        private String caption;
        private Object errorAttributes;
        private String datetime;
    }
}
