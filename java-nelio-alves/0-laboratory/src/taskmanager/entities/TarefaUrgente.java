package taskmanager.entities;

import taskmanager.enums.PrioridadeTarefa;
import taskmanager.enums.StatusTarefa;

import java.time.LocalDate;

public class TarefaUrgente extends Tarefa {
    public TarefaUrgente() {
    }

    public TarefaUrgente(String titulo, String descricao, LocalDate dataCriacao, Responsavel responsavel, StatusTarefa statusTarefa) {
        super(titulo, descricao, dataCriacao, responsavel, statusTarefa);
    }

    /*
    sobrescrita do método abstrato: aplicando sua própria lógica/comportamento em cima de um método declarado na
    superclasse Tarefa.(polimorfismo)

    toda tarefa urgente retorna com prioridade máxima
     */
    @Override
    public PrioridadeTarefa calcularPrioridade() {
        return PrioridadeTarefa.MAXIMA;
    }

    @Override
    public String toString() {
        return super.toString() + "\n    [ \uD83D\uDD34 URGENTE ]";
    }
}
