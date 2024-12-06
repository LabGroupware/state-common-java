package org.cresplanex.api.state.common.constants;

public class OrganizationServiceApplicationCode {

    public static final String SUCCESS = ServicePrefix.ORGANIZATION + "0000";
    public static final String INTERNAL_SERVER_ERROR = ServicePrefix.ORGANIZATION + "1000";
    public static final String NOT_FOUND = ServicePrefix.ORGANIZATION + "1001";
    public static final String DUPLICATE = ServicePrefix.ORGANIZATION + "1002";
    public static final String RESERVED_NAME = ServicePrefix.ORGANIZATION + "1003";
    public static final String OWNER_MUST_BE_USER = ServicePrefix.ORGANIZATION + "1004";
    public static final String INVALID_PLAN = ServicePrefix.ORGANIZATION + "1005";
    public static final String ALREADY_EXIST_USER = ServicePrefix.ORGANIZATION + "1006";
    public static final String NOT_EXIST_USER = ServicePrefix.ORGANIZATION + "1007";
    public static final String WILL_ADDED_USER_DUPLICATED = ServicePrefix.ORGANIZATION + "1008";
    public static final String NOT_ALLOWED_USERS_CONTAIN_OWNER = ServicePrefix.ORGANIZATION + "1009";
}
