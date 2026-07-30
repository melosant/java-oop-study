package onlineshop.application;

import onlineshop.model.entities.ItemPedido;
import onlineshop.model.entities.Pedido;
import onlineshop.model.entities.Produto;
import onlineshop.model.exceptions.PedidoException;

public class Program {
    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado", 250.0, 5);
        System.out.println(p1);

        Pedido pedido = new Pedido("Carlos");
        adicionarItens(pedido, p1);
        finalizarEExibir(pedido);
    }

    public static void adicionarItens(Pedido pedido, Produto produto) {
        try {
            System.out.print("Adicionar 3 unidades: ");
            pedido.adicionarItem(produto, 3);
            System.out.println("OK");

            System.out.print("Adicionar mais 3 unidades: ");
            pedido.adicionarItem(produto, 3);
            System.out.println("OK");

        } catch (PedidoException e) {
            System.out.println(e.getMessage());
        }
    }

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
