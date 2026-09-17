package collections.taskflow;

import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao TaskFlow!");
        GerenciadorTarefa gerenciadorTarefa = new GerenciadorTarefa();

        int opcao = 0;
        while (opcao != 6) {
            imprimirOpcoes();
            System.out.println("\nEscolha uma opção: ");
            System.out.print("> ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    adicionarTarefa(gerenciadorTarefa);
                    break;
                case 2:
                    removerTarefaPorId(gerenciadorTarefa);
                    break;
                case 3:
                    listarTarefas(gerenciadorTarefa);
                    break;
                case 4:
                    marcarComoConcluida(gerenciadorTarefa);
                    break;
                case 5:
                    procurarTarefa(gerenciadorTarefa);
                    break;
            }
        }
    }

    public static void imprimirOpcoes() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Adicionar Tarefa");
        System.out.println("2. Remover Tarefa por ID");
        System.out.println("3. Listar Tarefas");
        System.out.println("4. Marcar Tarefa como Concluída");
        System.out.println("5. Procurar Tarefa");
        System.out.println("6. Sair");
    }

    public static void adicionarTarefa(GerenciadorTarefa gt) {
        System.out.println("Digite o ID da tarefa:");
        System.out.print("> ");
        String id = sc.next();
        System.out.println("\nDigite a Descricao da tarefa:");
        System.out.print("> ");
        sc.nextLine();
        String desc = sc.nextLine();
        gt.adicionarTarefa(id, desc);
    }

    public static void removerTarefaPorId(GerenciadorTarefa gt) {
        System.out.println("Digite o ID da tarefa:");
        System.out.print("> ");
        String id = sc.next();

        gt.removerTarefa(id);
    }

    public static void listarTarefas(GerenciadorTarefa gt) {
        System.out.println("Tarefas: ");
        gt.imprimirTarefas();
    }

    public static void marcarComoConcluida(GerenciadorTarefa gt) {
        System.out.println("Digite o ID da tarefa:");
        System.out.print("> ");
        String id = sc.next();
        gt.finalizarTarefa(id);
    }

    public static void procurarTarefa(GerenciadorTarefa gt) {
        System.out.println("\nDigite a Descricao da tarefa:");
        System.out.print("> ");
        sc.nextLine();
        String desc = sc.nextLine();
        gt.procurarTarefa(desc);
    }
}
