package arrays.exercise9.application;

import arrays.exercise9.entity.Person;

import java.util.Locale;
import java.util.Scanner;

public class OlderApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos pessoas voce vai digitar? ");
        int n = sc.nextInt();

        Person[] people = new Person[n];
        String olderName = "";
        int olderAge = 0;

        for (int i = 0; i < people.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();

            people[i] = new Person(name, age);
            if (i == 0) {
                olderAge = age;
                olderName = name;
            } else {
                if (age > olderAge) {
                    olderName = name;
                    olderAge = age;
                }
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + olderName);
    }
}
