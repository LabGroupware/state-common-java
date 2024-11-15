package org.cresplanex.api.state.common.event;

import org.cresplanex.api.state.common.constants.ServiceType;

public class EventAggregateType {

    public static final String USER = ServiceType.AUTH_AUTH_SERVICE + ".Aggregate.User";

    public static final String JOB = ServiceType.NOVA_JOB + ".Aggregate.Job";

    public static final String USER_PROFILE = ServiceType.NOVA_USER_PROFILE + ".Aggregate.UserProfile";
    public static final String USER_PREFERENCE = ServiceType.NOVA_USER_PREFERENCE + ".Aggregate.UserPreference";
    public static final String USER_PRESENCE = ServiceType.NOVA_USER_PRESENCE + ".Aggregate.UserPresence";
    public static final String ORGANIZATION = ServiceType.NOVA_ORGANIZATION + ".Aggregate.Organization";
    public static final String TEAM = ServiceType.NOVA_TEAM + ".Aggregate.Team";
    public static final String STORAGE = ServiceType.NOVA_STORAGE + ".Aggregate.Storage";
    public static final String STORAGE_BUCKET = ServiceType.NOVA_STORAGE + ".Aggregate.StorageBucket";
    public static final String STORAGE_OBJECT = ServiceType.NOVA_STORAGE + ".Aggregate.StorageObject";
    public static final String PLAN = ServiceType.NOVA_PLAN + ".Aggregate.Plan";
    public static final String PLAN_BUCKET = ServiceType.NOVA_PLAN + ".Aggregate.PlanBucket";
    public static final String PLAN_TASK = ServiceType.NOVA_PLAN + ".Aggregate.PlanTask";
}
