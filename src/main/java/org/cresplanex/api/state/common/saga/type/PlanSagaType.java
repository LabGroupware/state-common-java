package org.cresplanex.api.state.common.saga.type;

import org.cresplanex.api.state.common.saga.SagaCommandChannel;

public class PlanSagaType {

    public static final String CREATE_TASK = SagaCommandChannel.PLAN + ".CreateTask";
    public static final String UPDATE_TASK_STATUS = SagaCommandChannel.PLAN + ".UpdateTaskStatus";
}
