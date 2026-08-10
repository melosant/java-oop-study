package ex04.model.entities;

public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;
    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // método compareTo da interface Comparable
    // defino uma comparação entre o nome desse empregado com outro
    // retorna um valor de acordo com a posição alfabética (se vier depois = maior, antes = menor, igual = 0)
    // se fossem valores numéricos a comparação seria entre os próprios valores.
    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }
}

