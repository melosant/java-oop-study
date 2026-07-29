package payroll.entities;

import payroll.enums.Departamento;

import java.util.Date;

public class Gerente extends Funcionario {
    private Double salarioBase;
    private Double bonus;

    public Gerente() {
    }

    public Gerente(String nome, String cpf, Date dataAdmissao, Departamento departamento, Endereco endereco, Double salarioBase, Double bonus) {
        super(nome, cpf, dataAdmissao, departamento, endereco);
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " | $" +
                String.format("%.2f", calcularSalario()) +
                " (Bonus: $" + String.format("%.2f", bonus) + ")";
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
