package processamentoPagamento.model.entities;

import processamentoPagamento.model.exceptions.PagamentoException;

public class PagamentoBoleto implements MetodoPagamento, Notificavel {
    private int diasParaVencimento;

    public PagamentoBoleto(int diasParaVencimento) {
        this.diasParaVencimento = diasParaVencimento;
    }

    @Override
    public boolean processar(double valor) throws PagamentoException {
        if (diasParaVencimento < 1) {
            throw new PagamentoException("Não é possível gerar boleto com prazo de vencimento inválido.");
        }
        notificar("[NOTIFICAÇÃO] Pagamento processado no valor R$" + String.format("%.2f", valor) + " via Boleto.");
        return true;
    }

    @Override
    public String getDescricao() {
        return "";
    }

    public int getDiasParaVencimento() {
        return diasParaVencimento;
    }

    public void setDiasParaVencimento(int diasParaVencimento) {
        this.diasParaVencimento = diasParaVencimento;
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println(mensagem);
    }
}
