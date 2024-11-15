package org.cresplanex.api.state.common.saga.command.userprofile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.saga.type.UserProfileSagaType;

public class CreateUserProfileCommand {

    private static final String PREFIX = UserProfileSagaType.CREATE_USER_PROFILE + ".Command.CreateUserProfile.";

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Exec extends UserProfileSagaCommand {
        public static final String TYPE = PREFIX + "Exec";

        private String userId;
        private String name;
        private String email;
        private String nickname;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Undo extends UserProfileSagaCommand {
        public static final String TYPE = PREFIX + "Undo";

        private String userProfileId;
    }
}
