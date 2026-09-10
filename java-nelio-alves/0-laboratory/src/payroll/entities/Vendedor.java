package payroll.entities;

import payroll.enums.Departamento;

import java.util.Date;

public class Vendedor extends Funcionario {
    private Double salarioBase;
    private Double totalVendasMes;
    private static final Double TAXA_COMISSAO = 0.05;

    public Vendedor() {
    }

    public Vendedor(String nome, String cpf, Date dataAdmissao, Departamento departamento, Endereco endereco, Double salarioBase, Double totalVendasMes) {
        super(nome, cpf, dataAdmissao, departamento, endereco);
        this.salarioBase = salarioBase;
        this.totalVendasMes = totalVendasMes;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (totalVendasMes * TAXA_COMISSAO);
    }

    @Override
    public String toString() {
        return super.toString() + " | $" +
                String.format("%.2f", calcularSalario()) +
                " (Vendas no Mes: $" + String.format("%.2f", totalVendasMes) +
                " | Taxa Comissao: " + TAXA_COMISSAO + ")";
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getTotalVendasMes() {
        return totalVendasMes;
    }

    public void setTotalVendasMes(Double totalVendasMes) {
        this.totalVendasMes = totalVendasMes;
    }

    public Double getTAXA_COMISSAO() {
        return TAXA_COMISSAO;
    }
}
