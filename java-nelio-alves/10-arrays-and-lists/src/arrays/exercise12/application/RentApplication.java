package arrays.exercise12.application;

import arrays.exercise12.entity.Renter;

import java.util.Locale;
import java.util.Scanner;

public class RentApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Renter[] rooms = new Renter[10];
        
        System.out.print("How many rooms wiil be rented? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1));
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            rooms[room] = new Renter(name, email);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }
    }
}
