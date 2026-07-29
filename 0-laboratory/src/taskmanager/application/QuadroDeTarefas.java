package taskmanager.application;

import taskmanager.entities.*;
import taskmanager.enums.FrequenciaRecorrencia;
import taskmanager.enums.StatusTarefa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuadroDeTarefas {
    public static List<Tarefa> filtroStatus(StatusTarefa statusBuscado, List<Tarefa> tarefas) {
        return tarefas.stream()
                .filter(t -> t.getStatusTarefa() == statusBuscado)
                .toList();
    }

    public static void main(String[] args) {
        Responsavel responsavel = new Responsavel("Mario", "mario@gmail.com");
        List<Tarefa> list = new ArrayList<>();

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

        list.add(t1);
        list.add(t2);
        list.add(t3);

        list.sort(Comparator.comparing(Tarefa::calcularPrioridade).reversed());
        System.out.println("------ TAREFAS POR PRIORIDADE ------");
        for (Tarefa tarefa : list) {
            System.out.println(tarefa);
            System.out.println();
        }

        System.out.println("\n------ TAREFAS PENDENTE ------");
        List<Tarefa> tarefasPendentes = filtroStatus(StatusTarefa.PENDENTE, list);
        for (Tarefa t : tarefasPendentes) {
            System.out.println(t);
            System.out.println();
        }
    }
}
