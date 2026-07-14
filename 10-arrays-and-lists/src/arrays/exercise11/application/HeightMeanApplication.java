package arrays.exercise11.application;

import arrays.exercise11.entity.Person;

import java.util.Locale;
import java.util.Scanner;

public class HeightMeanApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos pessoas voce vai digitar? ");
        int n = sc.nextInt();

        Person[] people = new Person[n];
        double lowestHeight = 0.0;
        double highestHeight = 0.0;
        double sumFemaleHeight = 0.0;
        int womansQuantity = 0;
        int mansQuantity = 0;

        for (int i = 0; i < people.length; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double height = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            sc.nextLine();
            char gender = sc.next().toUpperCase().charAt(0);

            if (i == 0) { lowestHeight = height; highestHeight = height; }
            else {
                if (height > highestHeight) { highestHeight = height; }
                if (height < lowestHeight) { lowestHeight = height; }
            }

            if (gender == 'M') { mansQuantity++; }
            else { womansQuantity++; sumFemaleHeight += height; }
        }

        System.out.println("Menor altura = " + lowestHeight);
        System.out.println("Maior altura = " + highestHeight);
        System.out.println("Media das alturas das mulheres = " + String.format("%.2f", (sumFemaleHeight / womansQuantity)));
        System.out.println("Numero de homens = " + mansQuantity);
    }
}
