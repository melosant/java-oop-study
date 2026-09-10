package exercise5.application;

import exercise5.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class DollarConverterApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarBought = sc.nextDouble();
        System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.dollarConverter(dollarPrice, dollarBought));


        sc.close();
    }
}
