package onlineshop.model.exceptions;

public class QuantidadeInvalidaException extends PedidoException{
    public QuantidadeInvalidaException() {
        super("Erro: Insira uma quantidade válida.");
    }
}
