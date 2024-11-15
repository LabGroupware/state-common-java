package org.cresplanex.api.state.common.saga.type;

import org.cresplanex.api.state.common.saga.SagaCommandChannel;

public class OrganizationSagaType {

    public static final String CREATE_ORGANIZATION = SagaCommandChannel.ORGANIZATION + ".CreateOrganization";
    public static final String ADD_USERS_TO_ORGANIZATION = SagaCommandChannel.ORGANIZATION + ".AddUsersToOrganization";
}
