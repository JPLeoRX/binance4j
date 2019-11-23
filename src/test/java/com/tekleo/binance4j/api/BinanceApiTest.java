package com.tekleo.binance4j.api;

import com.tekleo.binance4j.objects.Candlestick;
import com.tekleo.binance4j.utils.Interval;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinanceApiTest {
    private BinanceApi binanceApi = new BinanceApiFactory().create();

    @Test
    public void getKlines() {
        List<Candlestick> candlesticks = null;
        boolean exception = false;

        try {
            candlesticks = binanceApi.getKlines("BTCUSDT", Interval.HOURS_1, 3);
        } catch (Exception e) {
            exception = true;
        }

        assertFalse(exception);
        assertNotNull(candlesticks);
        assertEquals(3, candlesticks.size());
    }
}
