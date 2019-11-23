package com.tekleo.binance4j.api;

import com.tekleo.binance4j.objects.Candlestick;
import com.tekleo.binance4j.utils.Interval;

import java.util.List;

public interface BinanceApi {
    List<Candlestick> getKlines(String symbol, Interval interval, long startTime, long endTime, int limit) throws BinanceApiException;

    default List<Candlestick> getKlines(String symbol, Interval interval, int limit) throws BinanceApiException {
        return getKlines(symbol, interval, -1, -1, limit);
    }

    default List<Candlestick> getKlines(String symbol, Interval interval) throws BinanceApiException {
        return getKlines(symbol, interval, -1, -1, -1);
    }
}
