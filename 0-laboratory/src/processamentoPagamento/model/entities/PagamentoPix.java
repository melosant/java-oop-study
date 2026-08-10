package processamentoPagamento.model.entities;

public class PagamentoPix implements MetodoPagamento, Notificavel {
    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean processar(double valor) {
        notificar("[NOTIFICAÇÃO] Pix enviado para " + chavePix + " no valor de R$" + String.format("%.2f", valor));
        return true;
    }

    @Override
    public String getDescricao() {
        return "";
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println(mensagem);
    }
}
