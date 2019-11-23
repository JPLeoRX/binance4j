package com.tekleo.binance4j.objects;

public class CandlestickParsed {
    private long openTime;
    private long closeTime;
    private double open;
    private double close;
    private double low;
    private double high;
    private double volume;
    private double quoteAssetVolume;
    private double takerBuyBaseAssetVolume;
    private double takerBuyQuoteAssetVolume;

    public CandlestickParsed(
            long openTime, long closeTime,
            double open, double close,
            double low, double high,
            double volume, double quoteAssetVolume,
            double takerBuyBaseAssetVolume, double takerBuyQuoteAssetVolume) {
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.open = open;
        this.close = close;
        this.low = low;
        this.high = high;
        this.volume = volume;
        this.quoteAssetVolume = quoteAssetVolume;
        this.takerBuyBaseAssetVolume = takerBuyBaseAssetVolume;
        this.takerBuyQuoteAssetVolume = takerBuyQuoteAssetVolume;
    }

    public long getOpenTime() {
        return openTime;
    }

    public long getCloseTime() {
        return closeTime;
    }

    public long getInterval() {
        return getCloseTime() - getOpenTime();
    }

    public long getMidTime() {
        return getOpenTime() + getInterval() / 2;
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
        return "CandlestickParsed{" +
                "openTime=" + openTime +
                ", closeTime=" + closeTime +
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
