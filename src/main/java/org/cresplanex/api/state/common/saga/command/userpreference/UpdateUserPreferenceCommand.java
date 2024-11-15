package org.cresplanex.api.state.common.saga.command.userpreference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.saga.type.UserPreferenceSagaType;
import org.cresplanex.api.state.common.saga.type.UserProfileSagaType;

public class UpdateUserPreferenceCommand {

    public static final String PREFIX = UserPreferenceSagaType.UPDATE_USER_PREFERENCE + ".Command.UpdateUserPreference.";

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Exec extends UserPreferenceSagaCommand {
        public static final String TYPE = PREFIX + "Exec";

        private String userPreferenceId;
        private String theme;
        private String language;
        private String timezone;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Undo extends UserPreferenceSagaCommand {
        public static final String TYPE = PREFIX + "Undo";

        private String userPreferenceId;
        private String originTheme;
        private String originLanguage;
        private String originTimezone;
    }

}
