package org.cresplanex.api.state.common.saga.data.team;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.dto.team.TeamDto;
import org.cresplanex.api.state.common.dto.team.UserOnTeamDto;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateTeamResultData {
    private TeamDto team;
    private List<UserOnTeamDto> users;
}
