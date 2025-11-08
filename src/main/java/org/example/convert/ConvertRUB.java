package org.example.convert;

public final class ConvertRUB {
    public static double convert(double coin, Currency from, Currency to) {
        double rubles = coin * from.getRate();
        return rubles / to.getRate();
    }
}
