package onlineshop.model.entities;

import onlineshop.model.exceptions.EstoqueInsuficienteException;
import onlineshop.model.exceptions.PedidoException;
import onlineshop.model.exceptions.PedidoVazioException;
import onlineshop.model.exceptions.QuantidadeInvalidaException;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String nomeComprador;
    private List<ItemPedido> carrinho = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    /*
    função que adicionar um item ao carrinho, fazendo validações:
    1. verifica a quantidade informada
    2. verifica a quantidade do estoque
    diminui a quantidade no estoque previamente.
    */
    public void adicionarItem(Produto produto, int quantidade) throws PedidoException {
        if (quantidade <= 0) {
            throw new QuantidadeInvalidaException();
        }
        if (quantidade > produto.getEstoque()) {
            throw new EstoqueInsuficienteException();
        }

        carrinho.add(new ItemPedido(produto, quantidade));
        produto.diminuirEstoque(quantidade);
    }

    public double finalizarPedido() throws PedidoException {
        // finaliza o pedido verificando se o carrinho está vazio e retornando o total dele
        if (carrinho.isEmpty()) {
            throw new PedidoVazioException();
        }

        return calcularTotal();
    }

    // função auxiliar que calcula o total do pedido
    private double calcularTotal() {
        double sum = 0.0;
        for (ItemPedido item : carrinho) {
            sum += (item.getProduto().getPreco() * item.getQuantidade());
        }

        return sum;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public List<ItemPedido> getCarrinho() {
        return new ArrayList<>(carrinho);
    }
}
