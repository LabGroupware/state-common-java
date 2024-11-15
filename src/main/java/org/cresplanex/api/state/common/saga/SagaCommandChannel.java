package org.cresplanex.api.state.common.saga;

import org.cresplanex.api.state.common.constants.ServiceType;

public class SagaCommandChannel {

    public static final String USER_PROFILE = ServiceType.NOVA_USER_PROFILE + ".Saga";
    public static final String USER_PRESENCE = ServiceType.NOVA_USER_PRESENCE + ".Saga";
    public static final String USER_PREFERENCE = ServiceType.NOVA_USER_PREFERENCE + ".Saga";
    public static final String ORGANIZATION = ServiceType.NOVA_ORGANIZATION + ".Saga";
    public static final String TEAM = ServiceType.NOVA_TEAM + ".Saga";
    public static final String STORAGE = ServiceType.NOVA_STORAGE + ".Saga";
    public static final String PLAN = ServiceType.NOVA_PLAN + ".Saga";
}
