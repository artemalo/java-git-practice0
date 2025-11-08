package org.example.convert;

public final class ConvertRUB {
    /**
     * Converts an amount from one currency to another.
     * @param coin amount to convert (must be ≥ 0)
     * @param from source currency (cannot be null)
     * @param to target currency (cannot be null, rate must be > 0)
     * @return converted amount
     * @throws ConvertException if coin < 0, or currencies are invalid
     */
    public static double convert(double coin, Currency from, Currency to) throws ConvertException {
        if (coin < 0) {
            throw new ConvertException("Amount must be non‑negative");
        }
        if (from == null || to == null) {
            throw new ConvertException("Currency cannot be null");
        }
        if (to.getRate() < 0) {
            throw new ConvertException("Target currency rate cannot be less than zero");
        }

        double rubles = coin * from.getRate();
        return rubles / to.getRate();
    }
}
