package org.cresplanex.api.state.common.constants;

public class UserPreferenceServiceApplicationCode {

    public static final String SUCCESS = ServicePrefix.USER_PREFERENCE + "0000";
    public static final String INTERNAL_SERVER_ERROR = ServicePrefix.USER_PREFERENCE + "1000";
    public static final String NOT_FOUND = ServicePrefix.USER_PREFERENCE + "1001";
    public static final String DUPLICATE = ServicePrefix.USER_PREFERENCE + "1002";
    public static final String INVALID_THEME = ServicePrefix.USER_PREFERENCE + "1003";
    public static final String INVALID_LANGUAGE = ServicePrefix.USER_PREFERENCE + "1004";
    public static final String INVALID_TIMEZONE = ServicePrefix.USER_PREFERENCE + "1005";
}
