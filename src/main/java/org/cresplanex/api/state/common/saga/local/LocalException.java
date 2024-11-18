package org.cresplanex.api.state.common.saga.local;

import lombok.Getter;

@Getter
public abstract class LocalException extends RuntimeException {

    protected String applicationCode;
    protected String applicationCaption;
    protected Object data;

    public LocalException(
            String applicationCode,
            String applicationCaption,
            Object data,
            String message) {
        super(message);
        this.applicationCode = applicationCode;
        this.applicationCaption = applicationCaption;
        this.data = data;
    }

    public LocalException(String applicationCode, String applicationCaption, Object data, String message, Throwable cause) {
        super(message, cause);
        this.applicationCode = applicationCode;
        this.applicationCaption = applicationCaption;
        this.data = data;
    }

}
