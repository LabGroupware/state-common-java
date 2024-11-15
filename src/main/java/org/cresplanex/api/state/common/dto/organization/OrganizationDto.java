package org.cresplanex.api.state.common.dto.organization;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrganizationDto {

    private String organizationId;

    private String ownerId;

    private String name;

    private String plan;

    private String site_url;
}
