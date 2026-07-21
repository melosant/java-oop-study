package matrices.ex01;

import java.util.Scanner;

public class MatricesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int negativeNumbers = 0;

        int[][] matrice = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                int number = sc.nextInt();
                matrice[i][i1] = number;
            }
        }

        System.out.println("Main diagonal:");
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                if (i == i1) {
                    System.out.print(matrice[i][i1] + " ");
                }

                if (matrice[i][i1] < 0) {
                    negativeNumbers++;
                }
            }
        }

        System.out.println("\nNegative numbers = " + negativeNumbers);
        sc.close();
    }
}
