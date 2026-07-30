package onlineshop.model.exceptions;

public class PedidoVazioException extends PedidoException{
    public PedidoVazioException() {
        super("Erro: Não é possível finalizar um pedido com carrinho vazio.");
    }
}
