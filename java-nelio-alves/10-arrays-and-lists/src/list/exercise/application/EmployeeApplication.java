package list.exercise.application;

import list.exercise.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employeeList.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee id that will have salary increase : ");
        int findId = sc.nextInt();
        Employee employeeFind = employeeList.stream()
                .filter(x -> x.getId() == findId)
                .findFirst().orElse(null);

        if (employeeFind == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();

            employeeFind.increaseSalary(percentage);
        }

        System.out.println("\nList of employees:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
