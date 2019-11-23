package com.tekleo.binance4j.httpclient;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleHttpClientTest {
    @Test
    public void doGet() {
        String response = "";
        boolean exception = false;

        try {
            response = SimpleHttpClient.doGet("https://google.com");
        } catch (Exception e) {
            exception = true;
        }

        assertNotNull(response);
        assertNotEquals(response, "");
        assertFalse(exception);
    }
}
