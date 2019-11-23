package com.tekleo.binance4j.objects;

import java.io.Serializable;

public class Candlestick implements Serializable {
    private String symbol;
    private String interval;
    private long openTime;
    private String openTimeStr;
    private long closeTime;
    private String closeTimeStr;
    private double open;
    private double close;
    private double low;
    private double high;
    private double volume;
    private double quoteAssetVolume;
    private double takerBuyBaseAssetVolume;
    private double takerBuyQuoteAssetVolume;

    public Candlestick() {

    }

    public Candlestick(
            String symbol, String interval,
            long openTime, String openTimeStr,
            long closeTime, String closeTimeStr,
            double open, double close,
            double low, double high,
            double volume, double quoteAssetVolume,
            double takerBuyBaseAssetVolume, double takerBuyQuoteAssetVolume) {
        this.symbol = symbol;
        this.interval = interval;
        this.openTime = openTime;
        this.openTimeStr = openTimeStr;
        this.closeTime = closeTime;
        this.closeTimeStr = closeTimeStr;
        this.open = open;
        this.close = close;
        this.low = low;
        this.high = high;
        this.volume = volume;
        this.quoteAssetVolume = quoteAssetVolume;
        this.takerBuyBaseAssetVolume = takerBuyBaseAssetVolume;
        this.takerBuyQuoteAssetVolume = takerBuyQuoteAssetVolume;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getInterval() {
        return interval;
    }

    public long getOpenTime() {
        return openTime;
    }

    public String getOpenTimeStr() {
        return openTimeStr;
    }

    public long getCloseTime() {
        return closeTime;
    }

    public String getCloseTimeStr() {
        return closeTimeStr;
    }

    public double getOpen() {
        return open;
    }

    public double getClose() {
        return close;
    }

    public double getLow() {
        return low;
    }

    public double getHigh() {
        return high;
    }

    public double getVolume() {
        return volume;
    }

    public double getQuoteAssetVolume() {
        return quoteAssetVolume;
    }

    public double getTakerBuyBaseAssetVolume() {
        return takerBuyBaseAssetVolume;
    }

    public double getTakerBuyQuoteAssetVolume() {
        return takerBuyQuoteAssetVolume;
    }

    @Override
    public String toString() {
        return "Candlestick{" +
                "symbol='" + symbol + '\'' +
                ", interval='" + interval + '\'' +
                ", openTime=" + openTime +
                ", openTimeStr='" + openTimeStr + '\'' +
                ", closeTime=" + closeTime +
                ", closeTimeStr='" + closeTimeStr + '\'' +
                ", open=" + open +
                ", close=" + close +
                ", low=" + low +
                ", high=" + high +
                ", volume=" + volume +
                ", quoteAssetVolume=" + quoteAssetVolume +
                ", takerBuyBaseAssetVolume=" + takerBuyBaseAssetVolume +
                ", takerBuyQuoteAssetVolume=" + takerBuyQuoteAssetVolume +
                '}';
    }
}
