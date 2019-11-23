package com.tekleo.binance4j.api;

import com.tekleo.binance4j.converters.CandlestickConverter;
import com.tekleo.binance4j.httpclient.SimpleHttpClient;
import com.tekleo.binance4j.objects.Candlestick;
import com.tekleo.binance4j.objects.CandlestickParsed;
import com.tekleo.binance4j.objects.CandlestickRaw;
import com.tekleo.binance4j.utils.Interval;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinanceApiImpl implements BinanceApi {
    private static final String BASE_URL = "https://api.binance.com/api/v3";

    @Override
    public List<Candlestick> getKlines(String symbol, Interval interval, long startTime, long endTime, int limit) throws BinanceApiException {
        // Check arguments
        if (symbol == null)
            throw new BinanceApiException("Can't get klines for null symbol");
        if (interval == null)
            throw new BinanceApiException("Can't get klines for null interval");

        // Build url
        String url = BASE_URL + "/klines";
        String parameters = "?symbol=" + symbol + "&interval=" + interval.getStrValue();
        if (startTime != -1)
            parameters += "&startTime=" + startTime;
        if (endTime != -1)
            parameters += "&endTime=" + endTime;
        if (limit != -1)
            parameters += "&limit=" + limit;
        url += parameters;

        // Make REST call
        String response = null;
        try {
            response = SimpleHttpClient.doGet(url);
        } catch (Exception e) {
            throw new BinanceApiException("Failed to get klines: symbol=" + symbol + ", interval=" + interval + ", startTime=" + startTime + ", endTime=" + endTime + ", limit=" + limit, e);
        }

        // Check for null response
        if (response == null)
            throw new BinanceApiException("Response is null");

        // Split response into separate sticks, and trim it
        List<String> sticks = Arrays.stream(response.split("],")).map(s -> s.replaceAll("\\[\\[", "").replaceAll("\\[", "").replaceAll("]]", "")).collect(Collectors.toList());

        // Parse sticks
        List<CandlestickRaw> raws = sticks.stream().map(str -> CandlestickConverter.toCandlestickRaw(str)).collect(Collectors.toList());
        List<CandlestickParsed> parseds = raws.stream().map(raw -> CandlestickConverter.toCandlestickParsed(raw)).collect(Collectors.toList());
        return parseds.stream().map(parsed -> CandlestickConverter.toCandlestick(symbol, interval.getStrValue(), parsed)).collect(Collectors.toList());
    }
}
