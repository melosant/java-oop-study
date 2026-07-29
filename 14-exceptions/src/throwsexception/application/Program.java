package throwsexception.application;

import throwsexception.model.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/mm/yyyy): ");
        LocalDate checkIn = LocalDate.parse(sc.next(), formatter);
        System.out.print("Check-out date (dd/mm/yyyy): ");
        LocalDate checkOut = LocalDate.parse(sc.next(), formatter);

        // primeiro verifica se a data de check-in é de fato anterior à de check-out
        if (!checkOut.isAfter(checkIn)) {
            System.out.println("Error in reservation: check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("\nEnter the data to update the reservation:");
            System.out.print("Check-in date (dd/mm/yyyy): ");
            checkIn = LocalDate.parse(sc.next(), formatter);
            System.out.print("Check-out date (dd/mm/yyyy): ");
            checkOut = LocalDate.parse(sc.next(), formatter);

            /*
            antes de fazer o update das datas:
            - verifica se as novas datas são de fato futuras
            - verifica novamente se a data de check-in é anterior à de check-out
            - caso passe nas verificações, faz o update
             */
            if (checkIn.isBefore(LocalDate.now()) || checkOut.isBefore(LocalDate.now())) {
                System.out.println("Error in reservation: Reservation dates for update must be future");
            } else if (!checkOut.isAfter(checkIn)) {
                System.out.println("Error in reservation: check-out date must be after check-in date");
            } else {
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: " + reservation);
            }
        }

        sc.close();
    }
}
