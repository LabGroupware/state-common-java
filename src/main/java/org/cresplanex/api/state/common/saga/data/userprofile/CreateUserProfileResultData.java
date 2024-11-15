package org.cresplanex.api.state.common.saga.data.userprofile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.dto.userpreference.UserPreferenceDto;
import org.cresplanex.api.state.common.dto.userprofile.UserProfileDto;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateUserProfileResultData {
    private UserProfileDto userProfile;
    private UserPreferenceDto userPreference;
}
