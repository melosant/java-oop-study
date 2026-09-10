package arrays.exercise3.application;

import arrays.exercise3.entity.Person;

import java.util.Locale;
import java.util.Scanner;

public class PersonApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Person[] people = new Person[n];
        double sumHeight = 0.0;
        int belowSixteen = 0;

        for (int i = 0; i < people.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            sumHeight += height;
            if (age < 16) { belowSixteen += 1; }

            people[i] = new Person(name, age, height);
        }

        double minorsPercentage = (double) belowSixteen / people.length * 100;

        System.out.printf("\nMédia das alturas: %.2f", (sumHeight / people.length));
        System.out.printf("\nPessoas abaixo dos 16 anos: %.1f%%\n", minorsPercentage);
        for (Person p : people) {
            if (p.getAge() < 16) {
                System.out.println(p.getName());
            }
        }
    }
}
