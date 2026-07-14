package arrays.exercise7.application;

import java.util.Locale;
import java.util.Scanner;

public class MeanApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] numbers = new double[n];
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        double mean = sum / numbers.length;

        System.out.printf("\nMEDIA DO VETOR = %.3f", mean);
        System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
        for (double num : numbers) {
            if (num < mean) {
                System.out.println(num);
            }
        }
    }
}
