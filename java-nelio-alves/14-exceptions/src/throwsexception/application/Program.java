package throwsexception.application;

import throwsexception.model.entities.Reservation;
import throwsexception.model.exceptions.DomainException;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/mm/yyyy): ");
            LocalDate checkIn = LocalDate.parse(sc.next(), formatter);
            System.out.print("Check-out date (dd/mm/yyyy): ");
            LocalDate checkOut = LocalDate.parse(sc.next(), formatter);

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("\nEnter the data to update the reservation:");
            System.out.print("Check-in date (dd/mm/yyyy): ");
            checkIn = LocalDate.parse(sc.next(), formatter);
            System.out.print("Check-out date (dd/mm/yyyy): ");
            checkOut = LocalDate.parse(sc.next(), formatter);

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error in reservation: input mismatch.");
        } catch (RuntimeException e) {
            System.out.println("Unexpected error!");
        }

        sc.close();
    }
}
