package org.cresplanex.api.state.common.dto.organization;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserOnOrganizationDto {

    public static UserOnOrganizationDto empty() {
        return new UserOnOrganizationDto();
    }

    private String userOrganizationId;

    private String userId;
}
