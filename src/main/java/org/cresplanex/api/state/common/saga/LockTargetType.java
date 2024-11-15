package org.cresplanex.api.state.common.saga;

import org.cresplanex.api.state.common.constants.ServiceType;

public class LockTargetType {

    public static final String USER_PROFILE = ServiceType.NOVA_USER_PROFILE + ".Saga.LockTarget.UserProfile";
    public static final String USER_PREFERENCE = ServiceType.NOVA_USER_PREFERENCE + ".Saga.LockTarget.UserPreference";
    public static final String USER_PRESENCE = ServiceType.NOVA_USER_PRESENCE + ".Saga.LockTarget.UserPresence";
    public static final String ORGANIZATION = ServiceType.NOVA_ORGANIZATION + ".Saga.LockTarget.Organization";
    public static final String TEAM = ServiceType.NOVA_TEAM + ".Saga.LockTarget.Team";
    public static final String STORAGE = ServiceType.NOVA_STORAGE + ".Saga.LockTarget.Storage";
    public static final String STORAGE_BUCKET = ServiceType.NOVA_STORAGE + ".Saga.LockTarget.StorageBucket";
    public static final String STORAGE_OBJECT = ServiceType.NOVA_STORAGE + ".Saga.LockTarget.StorageObject";
    public static final String PLAN = ServiceType.NOVA_PLAN + ".Saga.LockTarget.Plan";
    public static final String PLAN_BUCKET = ServiceType.NOVA_PLAN + ".Saga.LockTarget.PlanBucket";
    public static final String PLAN_TASK = ServiceType.NOVA_PLAN + ".Saga.LockTarget.PlanTask";
}
