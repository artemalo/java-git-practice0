package org.example.convert;

public enum Currency {
    RUB(1),
    DOLLAR(90);

    private final double rate;

    Currency(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}