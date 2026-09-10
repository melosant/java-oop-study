package taskmanager.entities;

import taskmanager.enums.PrioridadeTarefa;
import taskmanager.enums.StatusTarefa;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

// classe base abstrata
public abstract class Tarefa {
    protected String titulo;
    protected String descricao;
    protected LocalDate dataCriacao;

    // composição: uma tarefa TEM um responsavel.
    protected Responsavel responsavel;
    protected StatusTarefa statusTarefa;

    public Tarefa() {
    }

    public Tarefa(String titulo, String descricao, LocalDate dataCriacao, Responsavel responsavel, StatusTarefa statusTarefa) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.responsavel = responsavel;
        this.statusTarefa = statusTarefa;
    }

    // método abstrato -> método polimórfico
    public abstract PrioridadeTarefa calcularPrioridade();

    // método toString base para o resto (reaproveitamento)
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-   Titulo: " + titulo);
        sb.append("\n    Descrição: " + descricao);
        sb.append("\n    Data de Criação: " + dataCriacao);
        sb.append("\n    Responsável: " + responsavel.getNome());
        sb.append("\n    Status Atual: " + statusTarefa);

        return sb.toString();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public StatusTarefa getStatusTarefa() {
        return statusTarefa;
    }

    public void setStatusTarefa(StatusTarefa statusTarefa) {
        this.statusTarefa = statusTarefa;
    }
}
