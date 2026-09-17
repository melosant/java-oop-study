package collections.taskflow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorTarefa {
    private Map<String, Tarefa> tarefas = new HashMap<>();

    public GerenciadorTarefa() {
    }

    public void adicionarTarefa(String id, String descricao) {
        tarefas.put(id, new Tarefa(id, descricao, false));
        System.out.println("Tarefa \"" + descricao + "\" adicionada com sucesso!");
    }

    public void removerTarefa(String id) {
        Tarefa tarefaRemovida = tarefas.get(id);
        tarefas.remove(id);
        System.out.println("Tarefa \"" + tarefaRemovida.getDescricao() + "\" removida com sucesso!");
    }

    public void imprimirTarefas() {
        for (Tarefa t : tarefas.values()) {
            System.out.println("- " + t);
        }
    }

    public void finalizarTarefa(String id) {
        Tarefa tarefaFinalizada = tarefas.get(id);
        tarefaFinalizada.finalizarTarefa();
        System.out.println("Tarefa " + tarefaFinalizada.getDescricao() + " finalizada!");
    }

    public void procurarTarefa(String descricao) {
        for (Tarefa t : tarefas.values()) {
            if (t.getDescricao().contains(descricao)) {
                System.out.println("Tarefa encontrada!");
                System.out.println(t);
                return;
            }
        }
        System.out.println("Tarefa não-encontrada!");
    }
}
