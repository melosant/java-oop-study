package payroll.entities;

import payroll.enums.Departamento;

import java.util.Date;

public class Estagiario extends Funcionario {
    private Double bolsaAuxilio;
    private Integer horasTrabalhadas;

    public Estagiario() {
    }

    public Estagiario(String nome, String cpf, Date dataAdmissao, Departamento departamento, Endereco endereco, Double bolsaAuxilio, Integer horasTrabalhadas) {
        super(nome, cpf, dataAdmissao, departamento, endereco);
        this.bolsaAuxilio = bolsaAuxilio;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        if (horasTrabalhadas > 120) {
            System.out.println("Violação de Carga Horária! Não são pagas horas extras.");
        }
        return bolsaAuxilio;
    }

    @Override
    public String toString() {
        return super.toString() + " | $" +
                String.format("%.2f", calcularSalario()) +
                " (Total Horas: " + horasTrabalhadas + ")";
    }

    public Double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(Double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
