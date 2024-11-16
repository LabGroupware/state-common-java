package org.cresplanex.api.state.common.saga.validate.userprofile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.ServiceType;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserProfileExistValidateCommand extends UserProfileSagaValidateCommand {

    public static final String TYPE = ServiceType.NOVA_USER_PROFILE + ".Saga.ValidateCommand.UserProfileExist";

    private List<String> userIds;
    private boolean any;
}
