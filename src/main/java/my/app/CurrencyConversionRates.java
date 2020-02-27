package my.app;

import java.math.BigDecimal;

public enum CurrencyConversionRates {
    USD_INR(Currency.USD, Currency.INR, BigDecimal.valueOf(71.662854)),
    USD_CAD(Currency.USD, Currency.CAD, BigDecimal.valueOf(1.317843)),
    USD_CHF(Currency.USD, Currency.JPY, BigDecimal.valueOf(106.929702)),
    CAD_ARS(Currency.USD, Currency.ARS, BigDecimal.valueOf(42.348184));

    final Currency input;
    final Currency output;
    final BigDecimal rate;

    CurrencyConversionRates(final Currency input,
                            final Currency output,
                            final BigDecimal rate) {
        this.input = input;
        this.output = output;
        this.rate = rate;
    }
}
