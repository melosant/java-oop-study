package exercise2.entity;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    // metodo toString -> mudo a string que eh exibida ao fazer a chamada do objeto diretamente
    @Override
    public String toString() {
        return name + ", $" + String.format("%.2f", netSalary());
    }

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary = grossSalary + (grossSalary * (percentage / 100));
    }
}
