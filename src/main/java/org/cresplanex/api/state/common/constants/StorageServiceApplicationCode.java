package org.cresplanex.api.state.common.constants;

public class StorageServiceApplicationCode {

    public static final String SUCCESS = ServicePrefix.STORAGE + "0000";
    public static final String INTERNAL_SERVER_ERROR = ServicePrefix.STORAGE + "1000";
    public static final String NOT_FOUND = ServicePrefix.STORAGE + "1001";
    public static final String DUPLICATE = ServicePrefix.STORAGE + "1002";
    public static final String FILE_OBJECT_NOT_FOUND = ServicePrefix.STORAGE + "1003";
    public static final String FILE_OBJECT_DUPLICATE = ServicePrefix.STORAGE + "1004";
}
