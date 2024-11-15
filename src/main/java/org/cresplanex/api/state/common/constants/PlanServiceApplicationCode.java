package org.cresplanex.api.state.common.constants;

public class PlanServiceApplicationCode {

    public static final String SUCCESS = ServicePrefix.PLAN + "0000";
    public static final String INTERNAL_SERVER_ERROR = ServicePrefix.PLAN + "1000";
    public static final String NOT_FOUND = ServicePrefix.PLAN + "1001";
    public static final String DUPLICATE = ServicePrefix.PLAN + "1002";
    public static final String INVALID_STATUS = ServicePrefix.PLAN + "1003";
    public static final String TASK_NOT_FOUND = ServicePrefix.PLAN + "1004";
    public static final String TASK_DUPLICATE = ServicePrefix.PLAN + "1005";
    public static final String TASK_INVALID_STATUS = ServicePrefix.PLAN + "1006";
}
