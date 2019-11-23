package com.tekleo.binance4j.utils;

public enum Interval {
    MINUTES_15("15m", Time.Minutes.toMillis(15)),
    MINUTES_30("30m", Time.Minutes.toMillis(30)),
    HOURS_1("1h", Time.Hours.toMillis(1)),
    HOURS_2("2h", Time.Hours.toMillis(2)),
    HOURS_4("4h", Time.Hours.toMillis(4)),
    HOURS_6("6h", Time.Hours.toMillis(6)),
    HOURS_8("8h", Time.Hours.toMillis(8)),
    HOURS_12("12h", Time.Hours.toMillis(12)),
    DAYS_1("1d", Time.Days.toMillis(1)),
    WEEK_1("1w", Time.Days.toMillis(7));

    private String strValue;
    private long duration;

    Interval(String strValue, long duration) {
        this.strValue = strValue;
        this.duration = duration;
    }

    public String getStrValue() {
        return strValue;
    }

    public long getDuration() {
        return duration;
    }

    public static Interval fromStrValue(String strValue) {
        for (Interval interval : Interval.values()) {
            if (interval.getStrValue().equalsIgnoreCase(strValue)) {
                return interval;
            }
        }

        throw new IllegalArgumentException("Unknown str value: " + strValue);
    }
}
