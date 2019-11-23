package com.tekleo.binance4j.api;

public class BinanceApiException extends Exception {
    public BinanceApiException() {

    }

    public BinanceApiException(String message) {
        super(message);
    }

    public BinanceApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public BinanceApiException(Throwable cause) {
        super(cause);
    }

    public BinanceApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
