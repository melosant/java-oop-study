package ex1.application;

import ex1.model.entities.Account;
import ex1.model.exceptions.BusinessException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Entre com os dados da conta:");
            System.out.print("Número: ");
            int numero = sc.nextInt();
            System.out.print("Titular: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Saldo inicial: $");
            double saldoInicial = sc.nextDouble();
            System.out.print("Limite de saque: $");
            double limiteSaque = sc.nextDouble();

            Account account = new Account(numero, nome, limiteSaque);
            account.deposit(saldoInicial);

            System.out.print("\n\nQual valor do saque? $");
            double valorSaque = sc.nextDouble();
            account.withdraw(valorSaque);

            System.out.println("Saldo Atual: $" + String.format("%.2f", account.getBalance()));
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("ERRO INESPERADO: " + e.getMessage());
        }

        sc.close();
    }
}
