package my.app;

import lombok.RequiredArgsConstructor;

public enum Currency {
    USD("USD"),
    INR("INR"),
    CAD("CAD"),
    CHF("CHF"),
    JPY("JPY"),
    ARS("ARS");

    final String currencyCode;

    Currency(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
