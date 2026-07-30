package onlineshop.application;

import onlineshop.model.entities.ItemPedido;
import onlineshop.model.entities.Pedido;
import onlineshop.model.entities.Produto;
import onlineshop.model.exceptions.EstoqueInsuficienteException;
import onlineshop.model.exceptions.PedidoException;
import onlineshop.model.exceptions.QuantidadeInvalidaException;

public class Program {
    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado", 250.0, 5);
        System.out.println(p1);

        Pedido pedido = new Pedido("Carlos");
        adicionarItem(pedido, 3, p1);
        adicionarItem(pedido, 3, p1);
        finalizarEExibir(pedido);
    }

    // múltiplos catches só são viáveis quando tem comportamentos diferentes
    public static void adicionarItem(Pedido pedido, int quantidade, Produto produto) {
        try {
            pedido.adicionarItem(produto, quantidade);

        } catch (EstoqueInsuficienteException e) {
            System.out.println(e.getMessage() + " Estoque disponível: " + produto.getEstoque());
        } catch (QuantidadeInvalidaException e) {
            System.out.println(e.getMessage() + " Tente novamente com um valor maior que zero.");
        } catch (PedidoException e) {
            System.out.println("Erro inesperado no pedido: " + e.getMessage());
        }
    }

    // só um catch com a classe base pois teriam o mesmo comportamento
    public static void finalizarEExibir(Pedido pedido) {
        try {
            double total = pedido.finalizarPedido();
            System.out.println("\nTotal: $" + String.format("%.2f", total));
            for (ItemPedido item : pedido.getCarrinho()) {
                System.out.println(item);
            }
        } catch (PedidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
