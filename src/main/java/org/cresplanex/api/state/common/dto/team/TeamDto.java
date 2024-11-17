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
public class TeamDto {

    public static TeamDto empty() {
        return new TeamDto();
    }

    private String teamId;

    private String organizationId;

    private String name;

    private String description;

    private boolean isDefault;
}
