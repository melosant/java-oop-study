package inheritance.concept.application;

import inheritance.concept.entity.Account;
import inheritance.concept.entity.BusinessAccount;
import inheritance.concept.entity.SavingsAccount;

public class ProgramWithdraw {
    public static void main(String[] args) {
        // com a taxa
        Account acc1 = new Account("Alex", 1001, 1000.0);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());

        // sem a taxa devido à sobrescrita
        Account acc2 = new SavingsAccount("Maria", 1002, 1000.0, 0.01);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());

        // com acréscimo adicional de $2 devido à sobrescrita e método super().
        Account acc3 = new BusinessAccount("Bob", 1003, 1000.0, 500.0);
        acc3.withdraw(200);
        System.out.println(acc3.getBalance());
    }
}
