package arrays.exercise2.application;

import java.util.Locale;
import java.util.Scanner;

public class StatsApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        double[] numbers = new double[n];
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        System.out.print("\nVALORES: ");
        for (double number : numbers) {
            System.out.print(number + " ");
        }
        System.out.printf("\nSOMA: %.2f", sum);
        System.out.printf("\nMÉDIA: %.2f", sum / numbers.length);
    }
}
