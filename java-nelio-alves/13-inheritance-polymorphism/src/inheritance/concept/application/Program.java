package inheritance.concept.application;

import inheritance.concept.entity.Account;
import inheritance.concept.entity.BusinessAccount;
import inheritance.concept.entity.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account("Alex", 1001, 0.0);
        BusinessAccount bacc = new BusinessAccount("Maria", 1002, 0.0, 500.0);

        // UPCASTING -> não da erro de compilação pois subclasses são extensões das superclasses
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount("Bob", 1003, 0.0, 200.0);
        Account acc3 = new SavingsAccount("Anna", 1004, 0.0, 0.01);

        // DOWNCASTING -> dá erro, é necessário fazer um cast manual.
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // Tentar dar um DownCasting entre subclasses também dá erro
        // BusinessAccount acc5 = (BusinessAccount) acc3;

        // instance of -> verifica se a instância é do tipo específico.
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
