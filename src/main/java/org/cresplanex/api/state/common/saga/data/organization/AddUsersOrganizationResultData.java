package org.cresplanex.api.state.common.saga.data.organization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.dto.organization.OrganizationDto;
import org.cresplanex.api.state.common.dto.organization.UserOnOrganizationDto;
import org.cresplanex.api.state.common.dto.team.TeamDto;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddUsersOrganizationResultData {
    private List<UserOnOrganizationDto> addedUsers;
}
