package taskmanager.entities;

import taskmanager.enums.PrioridadeTarefa;
import taskmanager.enums.StatusTarefa;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// subclasse herdando da classe abstrata
public class TarefaComPrazo extends Tarefa {
    private LocalDate dataPrazo;

    public TarefaComPrazo() {
    }

    public TarefaComPrazo(String titulo, String descricao, LocalDate dataCriacao, Responsavel responsavel, StatusTarefa statusTarefa, LocalDate dataPrazo) {
        super(titulo, descricao, dataCriacao, responsavel, statusTarefa);
        this.dataPrazo = dataPrazo;
    }

    // função aux. para cálculo de diferença de dias (dia atual - prazo)
    private long calculoDias() {
        return ChronoUnit.DAYS.between(LocalDate.now(), dataPrazo);
    }

    /*
    sobrescrita do método abstrato: aplicando sua própria lógica/comportamento em cima de um método declarado na
    superclasse Tarefa.(polimorfismo)

    a prioridade é retornadada de acordo com a quantidade de dias para vencimento do prazo
     */
    @Override
    public PrioridadeTarefa calcularPrioridade() {
        long dias = calculoDias();

        if (dias <= 0) {
            return PrioridadeTarefa.MAXIMA;
        } else if (dias <= 3) {
            return PrioridadeTarefa.ALTA;
        } else if (dias <= 7) {
            return PrioridadeTarefa.MEDIA;
        } else {
            return PrioridadeTarefa.BAIXA;
        }
    }

    // sobrescrita do toString, reaproveitando o já declarado na superclasse
    @Override
    public String toString() {
        return super.toString() + "\n    - Dias para Vencimento: " + calculoDias();
    }

    public LocalDate getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(LocalDate dataPrazo) {
        this.dataPrazo = dataPrazo;
    }
}
