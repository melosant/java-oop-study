package abstracts.concept.application;

import abstracts.concept.entity.Circle;
import abstracts.concept.entity.Rectangle;
import abstracts.concept.entity.Shape;
import abstracts.concept.entity.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        List<Shape> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/RED/BLUE)? ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println("\nSHAPE AREAS:");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
