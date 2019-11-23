package com.tekleo.binance4j.httpclient;

public class SimpleHttpClientException extends Exception {
    public SimpleHttpClientException() {

    }

    public SimpleHttpClientException(String message) {
        super(message);
    }

    public SimpleHttpClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public SimpleHttpClientException(Throwable cause) {
        super(cause);
    }

    public SimpleHttpClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
