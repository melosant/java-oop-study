package inheritance.concept.application;

import inheritance.concept.entity.Account;
import inheritance.concept.entity.SavingsAccount;

public class ProgramPolymorphism {
    public static void main(String[] args) {
        // variáveis de tipos genéricas recebendo objetos de tipos específicos
        Account x = new Account("Alex", 1001, 1000.0);
        Account y = new SavingsAccount("Maria", 1002, 1000.0, 0.01);

        // mesmo método, porem comportamentos diferentes.
        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
