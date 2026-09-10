package onlineshop.model.entities;

import onlineshop.model.exceptions.PedidoException;
import onlineshop.model.exceptions.QuantidadeInvalidaException;

public class Produto {
    private String nome;
    private Double preco;
    private Integer estoque;

    public Produto() {
    }

    public Produto(String nome, Double preco, Integer estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // função auxiliar que diminui a quantidade do produto no estoque
    public void diminuirEstoque(int quantidade) throws PedidoException {
        if (quantidade <= 0) {
            throw new QuantidadeInvalidaException();
        }

        estoque -= quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome
                + ", preço $"
                + String.format("%.2f", preco)
                + ", estoque " + estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getEstoque() {
        return estoque;
    }
}
