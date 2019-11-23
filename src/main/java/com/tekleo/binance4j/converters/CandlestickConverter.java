package com.tekleo.binance4j.converters;

import com.tekleo.binance4j.objects.Candlestick;
import com.tekleo.binance4j.objects.CandlestickParsed;
import com.tekleo.binance4j.objects.CandlestickRaw;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class CandlestickConverter {
    public static CandlestickRaw toCandlestickRaw(String stick) {
        List<String> words = Arrays.stream(stick.split(",")).map(s -> s.replaceAll("\"", "")).collect(Collectors.toList());

        return new CandlestickRaw(
                words.get(0), words.get(1), words.get(2), words.get(3), words.get(4),
                words.get(5), words.get(6), words.get(7), words.get(8), words.get(9),
                words.get(10), words.get(11));
    }

    public static CandlestickParsed toCandlestickParsed(CandlestickRaw raw) {
        return new CandlestickParsed(
                Long.parseLong(raw.getOpenTime()), Long.parseLong(raw.getCloseTime()),
                Double.parseDouble(raw.getOpen()), Double.parseDouble(raw.getClose()),
                Double.parseDouble(raw.getLow()), Double.parseDouble(raw.getHigh()),
                Double.parseDouble(raw.getVolume()), Double.parseDouble(raw.getQuoteAssetVolume()),
                Double.parseDouble(raw.getTakerBuyBaseAssetVolume()), Double.parseDouble(raw.getTakerBuyQuoteAssetVolume())
        );
    }

    public static Candlestick toCandlestick(String symbol, String interval, CandlestickParsed parsed) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        return new Candlestick(
                symbol, interval,
                parsed.getOpenTime(), simpleDateFormat.format(new Date(parsed.getOpenTime())),
                parsed.getCloseTime(), simpleDateFormat.format(new Date(parsed.getCloseTime())),
                parsed.getOpen(), parsed.getClose(),
                parsed.getLow(), parsed.getHigh(),
                parsed.getVolume(), parsed.getQuoteAssetVolume(),
                parsed.getTakerBuyBaseAssetVolume(), parsed.getTakerBuyQuoteAssetVolume()
        );
    }
}
