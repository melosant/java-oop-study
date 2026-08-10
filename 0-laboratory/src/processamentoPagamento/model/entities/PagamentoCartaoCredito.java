package processamentoPagamento.model.entities;

public class PagamentoCartaoCredito implements MetodoPagamento, Notificavel {
    private String numeroCartao;
    private Double limiteDisponivel;

    public PagamentoCartaoCredito(String numeroCartao, Double limiteDisponivel) {
        this.numeroCartao = numeroCartao;
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public boolean processar(double valor) {
        if (valor <= limiteDisponivel) {
            limiteDisponivel -= valor;
            notificar("[NOTIFICAÇÃO] Pagamento processado de R$" + String.format("%.2f", valor) + " via Cartão " + numeroCartao);
            return true;
        }
        notificar("[NOTIFICAÇÃO] Limite não disponível.");
        return false;
    }

    @Override
    public String getDescricao() {
        return "";
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(Double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println(mensagem);
    }
}
