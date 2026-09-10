package ex05.application;

import ex05.model.services.BrasilInterestService;
import ex05.model.services.InterestService;
import ex05.model.services.UsaInterestService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InterestService is = new BrasilInterestService(2.0);
        InterestService usa = new UsaInterestService(1.0);

        System.out.print("Quantia: ");
        double amount = sc.nextDouble();
        System.out.print("Meses: ");
        int months = sc.nextInt();
        System.out.print("Pagamento apos " + months + " meses: (BR) " + String.format("%.2f", is.payment(amount, months)));
        System.out.print("\nPagamento apos " + months + " meses: (USA) " + String.format("%.2f", usa.payment(amount, months)));


        sc.close();
    }
}
