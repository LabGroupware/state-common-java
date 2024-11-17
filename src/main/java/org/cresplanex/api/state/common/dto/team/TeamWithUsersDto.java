package org.cresplanex.api.state.common.dto.team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TeamWithUsersDto {

    public static TeamWithUsersDto empty() {
        TeamDto team = TeamDto.empty();
        List<UserOnTeamDto> users = List.of();
        return new TeamWithUsersDto(team, users);
    }

    private TeamDto team;

    private List<UserOnTeamDto> users;
}
