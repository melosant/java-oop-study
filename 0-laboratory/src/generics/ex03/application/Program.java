package generics.ex03.application;

import generics.ex03.model.entities.Cliente;
import generics.ex03.model.entities.Produto;
import generics.ex03.model.entities.Repositorio;
import generics.ex03.model.exceptions.RepositorioException;

public class Program {
    public static void main(String[] args) {
        Repositorio<Produto> repositorioProdutos = new Repositorio<>();
        Repositorio<Cliente> repositorioClientes = new Repositorio<>();

        Produto produtoSearch = new Produto("Webcam", 89.99);
        Cliente clienteSearch = new Cliente("Paula", 42);

        repositorioProdutos.salvar(produtoSearch);
        repositorioProdutos.salvar(new Produto("Mouse", 109.99));
        repositorioProdutos.salvar(new Produto("Teclado", 229.99));

        repositorioClientes.salvar(clienteSearch);
        repositorioClientes.salvar(new Cliente("Marcio", 31));
        repositorioClientes.salvar(new Cliente("Marcela", 23));

        System.out.println("\nLISTAGEM GERAL:");

        System.out.println("Clientes:");
        for (Cliente c : repositorioClientes.listarTodos()) {
            System.out.println("- " + c);
        }

        System.out.println("Produtos:");
        for (Produto p : repositorioProdutos.listarTodos()) {
            System.out.println("- " + p);
        }

        System.out.println("\nBUSCA POR ID:");

        try {
            System.out.println("- " + repositorioClientes.buscarPorId(clienteSearch.getId()));
            System.out.println("- " + repositorioProdutos.buscarPorId(produtoSearch.getId()));
        } catch (RepositorioException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nBUSCA POR ID INEXISTENTE:");
        try {
            System.out.println("- " + repositorioClientes.buscarPorId(123));
        } catch (RepositorioException e) {
            throw new RuntimeException(e);
        }
    }
}
