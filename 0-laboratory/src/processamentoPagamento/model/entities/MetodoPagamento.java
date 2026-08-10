package processamentoPagamento.model.entities;

import processamentoPagamento.model.exceptions.PagamentoException;

public interface MetodoPagamento {
    boolean processar(double valor) throws PagamentoException;
    String getDescricao();
}
