package org.cresplanex.api.state.common.saga.validate.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.ServiceType;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class OrganizationUserExistValidateCommand extends OrganizationSagaValidateCommand {

    public static final String TYPE = ServiceType.NOVA_ORGANIZATION + ".Saga.ValidateCommand.OrganizationUserExist";

    private String organizationId;
    private List<String> userIds;
    private boolean any;
}