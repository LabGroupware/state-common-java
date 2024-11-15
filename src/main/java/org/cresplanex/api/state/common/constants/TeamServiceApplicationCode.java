package org.cresplanex.api.state.common.constants;

public class TeamServiceApplicationCode {

    public static final String SUCCESS = ServicePrefix.TEAM + "0000";
    public static final String INTERNAL_SERVER_ERROR = ServicePrefix.TEAM + "1000";
    public static final String NOT_FOUND = ServicePrefix.TEAM + "1001";
    public static final String DUPLICATE = ServicePrefix.TEAM + "1002";
    public static final String RESERVED_NAME = ServicePrefix.TEAM + "1003";
    public static final String OWNER_MUST_BE_USER = ServicePrefix.TEAM + "1004";
    public static final String ALREADY_EXIST_USER = ServicePrefix.TEAM + "1005";
    public static final String NOT_EXIST_USER = ServicePrefix.TEAM + "1006";
    public static final String NOT_ALLOWED_ON_DEFAULT_TEAM = ServicePrefix.TEAM + "1007";
}
