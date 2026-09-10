package payroll.entities;

import payroll.enums.Departamento;

import java.util.Date;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected Date dataAdmissao;
    protected Departamento departamento;

    protected Endereco endereco;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, Date dataAdmissao, Departamento departamento, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataAdmissao = dataAdmissao;
        this.departamento = departamento;
        this.endereco = endereco;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "- " + nome + " | " +
                dataAdmissao + " | " + departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
