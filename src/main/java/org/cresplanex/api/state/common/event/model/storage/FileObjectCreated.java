package org.cresplanex.api.state.common.event.model.storage;

import org.cresplanex.api.state.common.constants.ServiceType;
import org.cresplanex.api.state.common.event.model.*;

import java.util.List;

public class FileObjectCreated {

    private static final String PREFIX = ServiceType.NOVA_STORAGE + ".Event.FileObject.CreateJob.";

    public static class BeginJobDomainEvent extends BeginJobEvent implements FileObjectDomainEvent, BaseEvent {
        public static final String TYPE = PREFIX + "Begin";

        public BeginJobDomainEvent(String jobId, List<String> toActionCodes, String pendingActionCode, String timestamp) {
            super(jobId, toActionCodes, pendingActionCode, timestamp);
        }

        public BeginJobDomainEvent() {
        }

        @Override
        public String getType() {
            return TYPE;
        }
    }


    public static class FailedJobDomainEvent extends FailedJobEvent implements FileObjectDomainEvent, BaseEvent {
        public static final String TYPE = PREFIX + "Failed";

        public FailedJobDomainEvent(
                String jobId,
                Object data,
                String actionCode,
                String internalCode,
                String internalCaption,
                String timestamp,
                Object endedErrorAttributes
        ) {
            super(jobId, data, actionCode, internalCode, internalCaption, timestamp, endedErrorAttributes);
        }

        public FailedJobDomainEvent() {
        }

        @Override
        public String getType() {
            return TYPE;
        }
    }

    public static class ProcessedJobDomainEvent extends ProcessedJobEvent implements FileObjectDomainEvent, BaseEvent {
        public static final String TYPE = PREFIX + "Processed";

        public ProcessedJobDomainEvent(
                String jobId,
                Object data,
                String actionCode,
                String internalCode,
                String internalCaption,
                String timestamp
        ) {
            super(jobId, data, actionCode, internalCode, internalCaption, timestamp);
        }

        public ProcessedJobDomainEvent() {
        }

        @Override
        public String getType() {
            return TYPE;
        }
    }

    public static class SuccessJobDomainEvent extends SuccessJobEvent implements FileObjectDomainEvent, BaseEvent {
        public static final String TYPE = PREFIX + "Success";

        public SuccessJobDomainEvent(
                String jobId,
                Object data
        ) {
            super(jobId, data);
        }

        public SuccessJobDomainEvent() {
        }

        @Override
        public String getType() {
            return TYPE;
        }
    }
}
