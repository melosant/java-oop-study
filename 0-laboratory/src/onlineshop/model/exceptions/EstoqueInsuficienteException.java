package onlineshop.model.exceptions;

public class EstoqueInsuficienteException extends PedidoException{
    public EstoqueInsuficienteException() {
        super("Erro: Estoque insuficiente.");
    }
}
