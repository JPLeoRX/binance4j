package com.tekleo.binance4j.api;

public class BinanceApiFactory {
    public BinanceApi create() {
        return new BinanceApiImpl();
    }
}
