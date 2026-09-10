package arrays.exercise5.application;

import java.util.Locale;
import java.util.Scanner;

public class ValuesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] numbers = new double[n];
        double highestNumber = 0.0;
        int highestIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();

            if (i == 0) {
                highestNumber = numbers[i];
            }

            if (numbers[i] > highestNumber) {
                highestNumber = numbers[i];
                highestIndex = i;
            }
        }

        System.out.println("\nMAIOR VALOR = " + highestNumber);
        System.out.println("POSICAO DO MAIOR VALOR = " + highestIndex);
    }
}
