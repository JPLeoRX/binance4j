package com.tekleo.binance4j.utils;

public class Time {
    public static class Seconds {
        public static long toMillis(long seconds) {
            return seconds * 1000;
        }
    }

    public static class Minutes {
        public static long toMillis(long minutes) {
            return Seconds.toMillis(minutes * 60);
        }
    }

    public static class Hours {
        public static long toMillis(long hours) {
            return Minutes.toMillis(hours * 60);
        }
    }

    public static class Days {
        public static long toMillis(long days) {
            return Hours.toMillis(days * 24);
        }
    }

    public static class Months {
        public static long toMillis(long months) {
            return Days.toMillis(months * 30);
        }
    }

    public static class Years {
        public static long toMillis(long years) {
            return Months.toMillis(years * 12);
        }
    }
}
