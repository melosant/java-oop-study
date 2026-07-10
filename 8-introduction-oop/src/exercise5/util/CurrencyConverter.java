package exercise5.util;

public class CurrencyConverter {
    public static final double IOF_TAX = 6.0;

    public static double dollarConverter(double dollarPrice, double dollarBought){
        double dollarsWithoutIof = dollarBought * dollarPrice;
        return dollarsWithoutIof + (dollarsWithoutIof * (IOF_TAX / 100));
    }
}
