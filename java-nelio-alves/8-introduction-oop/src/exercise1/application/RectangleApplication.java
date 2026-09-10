package exercise1.application;

import exercise1.entity.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class RectangleApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // define o . como padrao do decimal
        Rectangle rectangle = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("\nAREA: %.2f", rectangle.area());
        System.out.printf("\nPERIMETER: %.2f", rectangle.perimeter());
        System.out.printf("\nDIAGONAL: %.2f", rectangle.diagonal());

        sc.close();
    }
}
