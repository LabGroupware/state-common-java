package org.cresplanex.api.state.common.saga.local.userpreference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.UserPreferenceServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.util.List;

public class NotFoundUserPreferenceException extends LocalException {

    public NotFoundUserPreferenceException(List<String> userPreferenceIds) {
        super(
                UserPreferenceServiceApplicationCode.NOT_FOUND,
                "UserPreference not found: " + userPreferenceIds.stream().reduce("", (a, b) -> a + ", " + b),
                new Data(userPreferenceIds),
                "UserPreference not found: " + userPreferenceIds.stream().reduce("", (a, b) -> a + ", " + b)
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "NOT_FOUND_USER_PREFERENCE";
        private List<String> userPreferenceIds;

        public Data(List<String> userPreferenceIds) {
            this.userPreferenceIds = userPreferenceIds;
        }
    }
}
