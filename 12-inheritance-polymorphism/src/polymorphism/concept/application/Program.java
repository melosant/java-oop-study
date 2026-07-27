package polymorphism.concept.application;

import polymorphism.concept.entity.Employee;
import polymorphism.concept.entity.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        List<Employee> employees = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.nextLine().toLowerCase().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per Hour: ");
            double valuePerHour = sc.nextDouble();

            if (outsourced == 'y') {
                System.out.print("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(employee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
        }

        System.out.println("\nPAYMENTS:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        sc.close();
    }
}
