package org.cresplanex.api.state.common.saga.type;

import org.cresplanex.api.state.common.saga.SagaCommandChannel;

public class TeamSagaType {

    public static final String CREATE_TEAM = SagaCommandChannel.TEAM + ".CreateTeam";
    public static final String ADD_USERS_TO_TEAM = SagaCommandChannel.TEAM + ".AddUsersToTeam";
}
