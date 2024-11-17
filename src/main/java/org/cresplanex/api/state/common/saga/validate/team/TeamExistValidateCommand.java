package org.cresplanex.api.state.common.saga.validate.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.ServiceType;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TeamExistValidateCommand extends TeamSagaValidateCommand {

    public static final String TYPE = ServiceType.NOVA_TEAM + ".Saga.ValidateCommand.TeamExist";

    private List<String> teamIds;
}
