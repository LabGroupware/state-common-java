package org.cresplanex.api.state.common.dto.team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserOnTeamDto {

    public static UserOnTeamDto empty() {
        return new UserOnTeamDto();
    }

    private String userTeamId;

    private String userId;
}
