package taskmanager.application;

import taskmanager.entities.*;
import taskmanager.enums.FrequenciaRecorrencia;
import taskmanager.enums.StatusTarefa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class App {
    public static void main(String[] args) {
        QuadroDeTarefas quadroDeTarefas = new QuadroDeTarefas();
        Responsavel responsavel = new Responsavel("Mario", "mario@gmail.com");

        Tarefa t1 = new TarefaUrgente(
                "Levar Avó ao Karatê",
                "Levar a coroa ao karatê pra ela movimentar o corpo",
                LocalDate.now(),
                responsavel,
                StatusTarefa.EM_ANDAMENTO
        );

        Tarefa t2 = new TarefaComPrazo(
                "Pagar Conta de Luz",
                "Pagar uma conta nem tao importante e nada urgente",
                LocalDate.now(),
                responsavel,
                StatusTarefa.PENDENTE,
                LocalDate.parse("27/07/2026", DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        );

        Tarefa t3 = new TarefaRecorrente(
                "Ir ao Mercado",
                "Compras da semana",
                LocalDate.now(),
                responsavel,
                StatusTarefa.PENDENTE,
                FrequenciaRecorrencia.SEMANAL
        );

        quadroDeTarefas.adicionar(t1);
        quadroDeTarefas.adicionar(t2);
        quadroDeTarefas.adicionar(t3);

        System.out.println("------ TAREFAS POR PRIORIDADE ------");
        List<Tarefa> tarefasOrdenadasPrioridade = quadroDeTarefas.ordernarPorPrioridade();
        for (Tarefa t : tarefasOrdenadasPrioridade) {
            System.out.println(t);
            System.out.println();
        }

        System.out.println("\n------ TAREFAS EM ANDAMENTO ------");
        List<Tarefa> tarefasPendentes = quadroDeTarefas.filtroStatus(StatusTarefa.EM_ANDAMENTO);
        for (Tarefa t : tarefasPendentes) {
            System.out.println(t);
            System.out.println();
        }
    }
}
