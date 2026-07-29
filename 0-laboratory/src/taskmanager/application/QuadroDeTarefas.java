package taskmanager.application;

import taskmanager.entities.*;
import taskmanager.enums.FrequenciaRecorrencia;
import taskmanager.enums.StatusTarefa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
classe criada com responsabilidade do quadro de tarefas
não é responsável pela aplicação, e sim pelas suas funcionalidades
 */
public class QuadroDeTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();

    public QuadroDeTarefas() {
    }

    // método bônus -> filtro de tarefas pelo status
    public List<Tarefa> filtroStatus(StatusTarefa statusBuscado) {
        return tarefas.stream()
                .filter(t -> t.getStatusTarefa() == statusBuscado)
                .toList();
    }

    public void adicionar(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    // função para ordenação por prioridade, é utilizada a ordem do enum como base para essa ordenação
    public List<Tarefa> ordernarPorPrioridade() {
        return tarefas.stream()
                .sorted(Comparator.comparing(Tarefa::calcularPrioridade).reversed())
                .toList();
    }

    // retorna uma cópia da lista (não seu atributo real)
    public List<Tarefa> getTarefas() {
        return new ArrayList<>(tarefas);
    }
}
