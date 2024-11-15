package org.cresplanex.api.state.common.event.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.ServiceType;
import org.cresplanex.api.state.common.event.model.BaseEvent;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreated implements UserDomainEvent, BaseEvent {
    public static final String TYPE = ServiceType.AUTH_AUTH_SERVICE
            + ".Event.User.Created";

    private String userId;
    private String name;
    private String email;
    private String nickname;

    public String getType() {
        return TYPE;
    }
}
