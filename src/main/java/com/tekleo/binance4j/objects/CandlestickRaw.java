package com.tekleo.binance4j.objects;

public class CandlestickRaw {
    private String openTime;
    private String open;
    private String high;
    private String low;
    private String close;
    private String volume;
    private String closeTime;
    private String quoteAssetVolume;
    private String numberOfTrades;
    private String takerBuyBaseAssetVolume;
    private String takerBuyQuoteAssetVolume;
    private String ignore;

    public CandlestickRaw(String openTime, String open, String high, String low, String close, String volume, String closeTime, String quoteAssetVolume, String numberOfTrades, String takerBuyBaseAssetVolume, String takerBuyQuoteAssetVolume, String ignore) {
        this.openTime = openTime;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        this.closeTime = closeTime;
        this.quoteAssetVolume = quoteAssetVolume;
        this.numberOfTrades = numberOfTrades;
        this.takerBuyBaseAssetVolume = takerBuyBaseAssetVolume;
        this.takerBuyQuoteAssetVolume = takerBuyQuoteAssetVolume;
        this.ignore = ignore;
    }

    public String getOpenTime() {
        return openTime;
    }

    public String getOpen() {
        return open;
    }

    public String getHigh() {
        return high;
    }

    public String getLow() {
        return low;
    }

    public String getClose() {
        return close;
    }

    public String getVolume() {
        return volume;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public String getQuoteAssetVolume() {
        return quoteAssetVolume;
    }

    public String getNumberOfTrades() {
        return numberOfTrades;
    }

    public String getTakerBuyBaseAssetVolume() {
        return takerBuyBaseAssetVolume;
    }

    public String getTakerBuyQuoteAssetVolume() {
        return takerBuyQuoteAssetVolume;
    }

    public String getIgnore() {
        return ignore;
    }

    @Override
    public String toString() {
        return "CandlestickRaw{" +
                "openTime='" + openTime + '\'' +
                ", open='" + open + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", close='" + close + '\'' +
                ", volume='" + volume + '\'' +
                ", closeTime='" + closeTime + '\'' +
                ", quoteAssetVolume='" + quoteAssetVolume + '\'' +
                ", numberOfTrades='" + numberOfTrades + '\'' +
                ", takerBuyBaseAssetVolume='" + takerBuyBaseAssetVolume + '\'' +
                ", takerBuyQuoteAssetVolume='" + takerBuyQuoteAssetVolume + '\'' +
                ", ignore='" + ignore + '\'' +
                '}';
    }
}
