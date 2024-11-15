package org.cresplanex.api.state.common.saga.data.organization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.dto.organization.OrganizationDto;
import org.cresplanex.api.state.common.dto.organization.UserOnOrganizationDto;
import org.cresplanex.api.state.common.dto.team.TeamDto;
import org.cresplanex.api.state.common.dto.userpreference.UserPreferenceDto;
import org.cresplanex.api.state.common.dto.userprofile.UserProfileDto;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateOrganizationResultData {
    private OrganizationDto organization;
    private TeamDto defaultTeam;
    private List<UserOnOrganizationDto> users;
}
