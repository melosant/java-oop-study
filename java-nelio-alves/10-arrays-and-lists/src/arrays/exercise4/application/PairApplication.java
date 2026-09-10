package arrays.exercise4.application;

import java.util.Locale;
import java.util.Scanner;

public class PairApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int pairQuantity = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();

            if (numbers[i] % 2 == 0) {
                pairQuantity += 1;
            }
        }

        System.out.println("NUMEROS PARES:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nQUANTIDADE DE PARES = " + pairQuantity);
    }
}
