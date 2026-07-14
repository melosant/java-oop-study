package arrays.exercise6.application;

import java.util.Locale;
import java.util.Scanner;

public class SumVectorApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos valores vao ter cada vetor? ");
        int n = sc.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectResult = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < vectResult.length; i++) {
            vectResult[i] = vectA[i] + vectB[i];
            System.out.println(vectResult[i]);
        }
    }
}
