package taskmanager.entities;

import taskmanager.enums.FrequenciaRecorrencia;
import taskmanager.enums.PrioridadeTarefa;
import taskmanager.enums.StatusTarefa;

import java.time.LocalDate;

// subclasse herdando da classe abstrata
public class TarefaRecorrente extends Tarefa {
    private FrequenciaRecorrencia frequencia;

    public TarefaRecorrente() {
    }

    public TarefaRecorrente(String titulo, String descricao, LocalDate dataCriacao, Responsavel responsavel, StatusTarefa statusTarefa, FrequenciaRecorrencia frequencia) {
        super(titulo, descricao, dataCriacao, responsavel, statusTarefa);
        this.frequencia = frequencia;
    }

    /*
    sobrescrita do método abstrato: aplicando sua própria lógica/comportamento em cima de um método declarado na
    superclasse Tarefa.(polimorfismo)

    a prioridade é retornada de acordo com a frequência declarada
    */
    @Override
    public PrioridadeTarefa calcularPrioridade() {
        if (frequencia == FrequenciaRecorrencia.DIARIA) {
            return PrioridadeTarefa.BAIXA;
        } else if (frequencia == FrequenciaRecorrencia.SEMANAL) {
            return PrioridadeTarefa.MEDIA;
        } else {
            return PrioridadeTarefa.ALTA;
        }
    }

    // sobrescrita do toString, reaproveitando o já declarado na superclasse
    @Override
    public String toString() {
        return super.toString() + "\n    - Frequência: " + frequencia;
    }

    public FrequenciaRecorrencia getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(FrequenciaRecorrencia frequencia) {
        this.frequencia = frequencia;
    }
}
