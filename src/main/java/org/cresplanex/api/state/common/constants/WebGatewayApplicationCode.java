package org.cresplanex.api.state.common.constants;

public class WebGatewayApplicationCode {

    public static final String SUCCESS = ServicePrefix.WEB_GATEWAY + "0000";
    public static final String INTERNAL_SERVER_ERROR = ServicePrefix.WEB_GATEWAY + "1000";
    public static final String VALIDATION_ERROR = ServicePrefix.WEB_GATEWAY + "1001";
    public static final String METHOD_NOT_ALLOWED = ServicePrefix.WEB_GATEWAY + "1002";
    public static final String NOT_SUPPORT_CONTENT_TYPE = ServicePrefix.WEB_GATEWAY + "1003";
    public static final String AUTHENTICATION_FAILED = ServicePrefix.WEB_GATEWAY + "1004";
    public static final String AUTHORIZATION_FAILED = ServicePrefix.WEB_GATEWAY + "1005";
    public static final String ACCESS_DENIED = ServicePrefix.WEB_GATEWAY + "1006";
    public static final String METHOD_ARGUMENT_TYPE_MISMATCH = ServicePrefix.WEB_GATEWAY + "1007";
    public static final String MISSING_PATH_VARIABLE = ServicePrefix.WEB_GATEWAY + "1008";
    public static final String EXCEED_MAX_UPLOAD_SIZE = ServicePrefix.WEB_GATEWAY + "1009";
    public static final String NOT_FOUND_HANDLER = ServicePrefix.WEB_GATEWAY + "1010";
    public static final String NOT_READABLE_REQUEST = ServicePrefix.WEB_GATEWAY + "1011";
}
