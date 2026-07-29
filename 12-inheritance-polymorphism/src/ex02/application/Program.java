package ex02.application;

import ex02.entities.Pessoa;
import ex02.entities.PessoaFisica;
import ex02.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        List<Pessoa> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual Income: $");
            double annualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: $");
                double healthExpenditures = sc.nextDouble();
                list.add(new PessoaFisica(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int nEmployees = sc.nextInt();
                list.add(new PessoaJuridica(name, annualIncome, nEmployees));
            }
        }

        double sum = 0.0;
        System.out.println("\nTAXES PAID:");
        for (Pessoa pessoa : list) {
            System.out.println(pessoa.getName() + ": $" + String.format("%.2f", pessoa.totalTaxes()));
            sum += pessoa.totalTaxes();
        }

        System.out.println("\nTOTAL TAXES: $" + String.format("%.2f", sum));
        sc.close();
    }
}
