package exercise2.application;

import exercise2.entity.Account;

import java.util.Locale;
import java.util.Scanner;

public class AccountApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the account number: ");
        int number = sc.nextInt();

        System.out.print("Enter the account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n) ? ");
        char initialDeposit = sc.next().charAt(0);

        Account account;
        if (initialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double amount = sc.nextDouble();

            account = new Account(number, name, amount);
        } else { account = new Account(number, name); }

        System.out.println("\nAccount data:");
        System.out.println(account);

        System.out.print("\nEnter the deposit value: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("\nEnter the withdraw value: ");
        amount = sc.nextDouble();
        account.withdraw(amount);
        System.out.println("Account data:");
        System.out.println(account);

        sc.close();
    }
}
