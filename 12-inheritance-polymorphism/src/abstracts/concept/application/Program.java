package abstracts.concept.application;

import abstracts.concept.entity.Account;
import abstracts.concept.entity.BusinessAccount;
import abstracts.concept.entity.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // permite instanciar suas subclasses numa variável genérica. (vantagem da classe abstrata)
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 500.0));
        list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));

        double sum = 0.0;

        for (Account account : list) {
            sum += account.getBalance();
        }

        System.out.println("Total balance: $" + String.format("%.2f", sum));

        for (Account account : list) {
            account.deposit(10.0);
        }

        for (Account account : list) {
            System.out.println(account.getNumber() + " $" + String.format("%.2f", account.getBalance()));
        }
    }
}
