package org.cresplanex.api.state.common.dto.organization;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrganizationWithUsersDto {

    public static OrganizationWithUsersDto empty() {
        OrganizationDto organization = OrganizationDto.empty();
        List<UserOnOrganizationDto> users = new ArrayList<>();
        return new OrganizationWithUsersDto(organization, users);
    }

    private OrganizationDto organization;

    private List<UserOnOrganizationDto> users;
}
