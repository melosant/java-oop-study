package arrays.exercise10.application;

import arrays.exercise10.entity.Student;

import java.util.Locale;
import java.util.Scanner;

public class GradeApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < students.length; i++) {
            sc.nextLine();
            System.out.println("Digite o nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Nota 1: ");
            double n1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double n2 = sc.nextDouble();

            students[i] = new Student(name, n1, n2);
        }

        System.out.println("Alunos Aprovados:");
        for (Student student : students) {
            if (student.medium() >= 6.0) {
                System.out.println(student.getName());
            }
        }
    }
}
