package processamentoPagamento.model.services;

import processamentoPagamento.model.entities.MetodoPagamento;
import processamentoPagamento.model.exceptions.PagamentoException;

public class ProcessadorPagamento {
    private MetodoPagamento metodoPagamento;

    public ProcessadorPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void executarPagamento(double valor) throws PagamentoException {
        boolean flag = metodoPagamento.processar(valor);

        if (flag) {
            System.out.println("Sucesso!");
        } else {
            System.out.println("Não Aprovado.");
        }
    }
}
