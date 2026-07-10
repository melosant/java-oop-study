package exercise4.util;

public class Calculator {
    // sao metodos estaticos pois os valores nao mudam de acordo com cada instancia
    // a area de um triangulo altera a cada instancia de triangulo
    // ja o calculo de uma calculadora nao.

    // final -> transforma a var em uma constante
    public static final double PI = 3.14159;

    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }
    public static double volume(double radius){
        return 4.0 * PI * (radius * radius * radius) / 3.0;
    }
}
