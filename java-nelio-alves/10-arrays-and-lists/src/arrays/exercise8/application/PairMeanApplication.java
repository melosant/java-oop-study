package arrays.exercise8.application;

import java.util.Locale;
import java.util.Scanner;

public class PairMeanApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int pairQuantity = 0;
        int pairSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
            if (numbers[i] % 2 == 0) {
                pairQuantity++;
                pairSum += numbers[i];
            }
        }

        if (pairQuantity == 0) { System.out.println("NENHUM NUMERO PAR"); }
        else { System.out.printf("\nMEDIA DOS PARES = %.1f", ((double) pairSum / pairQuantity)); }
    }
}
