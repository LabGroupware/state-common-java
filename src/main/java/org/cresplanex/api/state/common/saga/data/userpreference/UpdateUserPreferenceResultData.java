package org.cresplanex.api.state.common.saga.data.userpreference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.dto.userpreference.UserPreferenceDto;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateUserPreferenceResultData {
    private UserPreferenceDto userPreference;
}
