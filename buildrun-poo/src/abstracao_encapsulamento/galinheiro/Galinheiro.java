package abstracao_encapsulamento.galinheiro;

import java.time.LocalDateTime;

public class Galinheiro {
    private String nome;
    private int qtdGalinhas;
    private int ovosPorDiaPorGalinha;
    private LocalDateTime dataHoraCriacao;

    public Galinheiro(String nome, int qtdGalinhas, int ovosPorDiaPorGalinha, LocalDateTime dataHoraCriacao) {
        this.nome = nome;
        this.qtdGalinhas = qtdGalinhas;
        this.ovosPorDiaPorGalinha = ovosPorDiaPorGalinha;
        this.dataHoraCriacao = dataHoraCriacao;
    }

    private int calcularProducaoDiaria() {
        return qtdGalinhas * ovosPorDiaPorGalinha;
    }

    private int calcularProducaoMensal() {
        return calcularProducaoDiaria() * 30;
    }

    public void mostrarInfos() {
        System.out.println("-=-=-=-=-=-=-=-=");
        System.out.println("Nome do Galinheiro: " + nome);
        System.out.println("Quantidade de Galinhas: " + qtdGalinhas);
        System.out.println("Produção Diária: " + calcularProducaoDiaria() + " ovos.");
        System.out.println("Produção Mensal: " + calcularProducaoMensal() + " ovos.");
        System.out.println("-=-=-=-=-=-=-=-=");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdGalinhas() {
        return qtdGalinhas;
    }

    public void setQtdGalinhas(int qtdGalinhas) {
        this.qtdGalinhas = qtdGalinhas;
    }

    public int getOvosPorDiaPorGalinha() {
        return ovosPorDiaPorGalinha;
    }

    public void setOvosPorDiaPorGalinha(int ovosPorDiaPorGalinha) {
        this.ovosPorDiaPorGalinha = ovosPorDiaPorGalinha;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }
}
