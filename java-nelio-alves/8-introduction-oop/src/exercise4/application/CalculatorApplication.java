package exercise4.application;

import exercise4.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        // por serem metodos estaticos, nao preciso instanciar e chamo diretamente pela classe
        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("\nCircumference: %.2f", c);
        System.out.printf("\nVolume: %.2f", v);
        System.out.printf("\nPI: %.2f", Calculator.PI);
    }
}
