package org.cresplanex.api.state.common.saga.local.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.TeamServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.util.List;

public class ReservedTeamNameException extends LocalException {

    public ReservedTeamNameException(List<String> names) {
        super(
                TeamServiceApplicationCode.RESERVED_NAME,
                "Reserved team name: " + names.stream().reduce("", (a, b) -> a + ", " + b),
                new Data(names),
                "Reserved team name: " + names.stream().reduce("", (a, b) -> a + ", " + b)
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "RESERVED_NAME";
        private List<String> names;

        public Data(List<String> names) {
            this.names = names;
        }
    }
}
