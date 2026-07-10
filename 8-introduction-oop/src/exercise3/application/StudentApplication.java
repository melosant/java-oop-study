package exercise3.application;

import exercise3.entity.Student;

import java.util.Locale;
import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();

        System.out.println("Grades: ");
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();

        System.out.println("\nFINAL GRADE = " + student.finalGrade());

        if (student.finalGrade() >= 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + student.missingPoints() + " POINTS");
        }

        sc.close();
    }
}
