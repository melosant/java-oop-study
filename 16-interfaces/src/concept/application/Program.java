package concept.application;

import concept.model.entities.CarRental;
import concept.model.entities.Vehicle;
import concept.model.services.BrazilTaxService;
import concept.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dado do aluguel:");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/mm/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/mm/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: $");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: $");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.println("Pagamento básico: $" + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: $" + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: $" + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();
    }
}
