package org.cresplanex.api.state.common.utils;

import build.buf.gen.cresplanex.nova.v1.NullableInt64;
import build.buf.gen.cresplanex.nova.v1.NullableString;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ValueFromNullable {

    public static NullableString toNullableString (String value) {
        NullableString.Builder builder = NullableString.newBuilder()
                .setHasValue(value != null);

        if (value != null) {
            builder.setValue(value);
        }

        return builder.build();
    }

    public static NullableString toNullableString (LocalDate value) {
        return value != null ? toNullableString(String.valueOf(value)) : NullableString.getDefaultInstance();
    }

    public static NullableString toNullableString (LocalDateTime value) {
        return value != null ? toNullableString(String.valueOf(value)) : NullableString.getDefaultInstance();
    }

    public static NullableString toNullableString (Integer value) {
        return value != null ? toNullableString(String.valueOf(value)) : NullableString.getDefaultInstance();
    }

    public static NullableString toNullableString (Long value) {
        return value != null ? toNullableString(String.valueOf(value)) : NullableString.getDefaultInstance();
    }

    public static NullableString toNullableString (Boolean value) {
        return value != null ? toNullableString(String.valueOf(value)) : NullableString.getDefaultInstance();
    }

    public static NullableString toNullableString (Double value) {
        return value != null ? toNullableString(String.valueOf(value)) : NullableString.getDefaultInstance();
    }

    public static NullableString toNullableString (Float value) {
        return value != null ? toNullableString(String.valueOf(value)) : NullableString.getDefaultInstance();
    }

    public static NullableString toNullableString (Short value) {
        return value != null ? toNullableString(String.valueOf(value)) : NullableString.getDefaultInstance();
    }

    public static NullableString toNullableString (Byte value) {
        return value != null ? toNullableString(String.valueOf(value)) : NullableString.getDefaultInstance();
    }

    public static NullableString toNullableString (Character value) {
        return value != null ? toNullableString(String.valueOf(value)) : NullableString.getDefaultInstance();
    }

    public static NullableString toNullableString (Object value) {
        return value != null ? toNullableString(value.toString()) : NullableString.getDefaultInstance();
    }


    public static NullableInt64 toNullableInt (Integer value) {
        NullableInt64.Builder builder = NullableInt64.newBuilder()
                .setHasValue(value != null);

        if (value != null) {
            builder.setValue(value);
        }

        return builder.build();
    }
}
