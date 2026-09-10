package ex01.application;

import ex01.model.entities.Contract;
import ex01.model.entities.Installment;
import ex01.model.services.ContractService;
import ex01.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContractService contractService = new ContractService(new PaypalService());
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do Contrato: $");
        double amount = sc.nextDouble();

        Contract obj = new Contract(number, date, amount);

        System.out.print("Entre com o número de parcelas: ");
        int numInstallments = sc.nextInt();

        contractService.processContract(obj, numInstallments);

        System.out.println("\nParcelas:");
        for (Installment inst : obj.getInstallments()) {
            System.out.println(inst.getDueDate() + " - " + String.format("%.2f", inst.getAmount()));
        }

        sc.close();
    }
}
