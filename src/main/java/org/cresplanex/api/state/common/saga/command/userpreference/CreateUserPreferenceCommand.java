package org.cresplanex.api.state.common.saga.command.userpreference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.saga.type.UserProfileSagaType;

public class CreateUserPreferenceCommand {

    public static final String PREFIX = UserProfileSagaType.CREATE_USER_PROFILE + ".Command.CreateUserPreference.";

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Exec extends UserPreferenceSagaCommand {
        public static final String TYPE = PREFIX + "Exec";

        private String userId;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Undo extends UserPreferenceSagaCommand {
        public static final String TYPE = PREFIX + "Undo";

        private String userPreferenceId;
    }
}
