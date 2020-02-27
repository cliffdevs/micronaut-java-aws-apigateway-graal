package my.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConversionRatesTest {

    CurrencyConverter converter;

    @BeforeEach
    void before() {
        converter = new CurrencyConverter();
    }

    @Test
    void testAcquiresAccurateConversionRateForTransitiveCurrencies() {
        final Currency input = Currency.USD;
        final Currency desired = Currency.ARS;
        final BigDecimal expected = BigDecimal.valueOf(1.317843)
                .multiply(BigDecimal.valueOf(42.348184));

        BigDecimal result = converter.getConversionRateFrom(input, desired);
        assertEquals(expected, result);
    }
}




//
//Wu, Fiona <Fiona.Wu@disneystreaming.com>
//        9:03 AM (22 minutes ago)
//        to me, Ty
//
//        Please write a program that, given a list of currency conversion rates, will calculate the conversion rate between two currencies. E.g.:
//
//        USD INR  71.662854
//        USD CAD  1.317843
//        USD CHF  0.988015
//        USD JPY  106.929702
//        CAD ARS  42.348184
//
//
//
//        Given ARS and INR  , it would print out that
//
//
//
//        one ARS is ~= 1.28 INR
//
//
//        One ARS is ~ 0.0236 CAD
//        One CAD is 0.758815 USD
//        one USD is 71.662 INR
//
//
//        0.02356 * 0.758815 * 71.662 ~= 1.28