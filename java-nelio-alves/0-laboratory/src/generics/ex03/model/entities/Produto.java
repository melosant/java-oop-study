package generics.ex03.model.entities;

public class Produto implements Identificavel{
    private Integer id;
    private String nomeProduto;
    private Double precoProduto;

    public Produto(String nomeProduto, Double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.id = emissaoId();
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    private Integer emissaoId() {
        int ascii = 0;
        for (char caractere : nomeProduto.toCharArray()) {
            ascii += (int) caractere;
        }

        return ascii * 31;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", NOME: " + nomeProduto + ", PREÇO : $" + String.format("%.2f", precoProduto);
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }
}
