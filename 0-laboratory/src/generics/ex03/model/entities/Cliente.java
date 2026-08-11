package generics.ex03.model.entities;

public class Cliente implements Identificavel{
    private Integer id;
    private String nomeCliente;
    private Integer idadeCliente;

    public Cliente(String nomeCliente, Integer idadeCliente) {
        this.nomeCliente = nomeCliente;
        this.idadeCliente = idadeCliente;
        this.id = emissaoId();
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    private Integer emissaoId() {
        int ascii = 0;
        for (char caractere : nomeCliente.toCharArray()) {
            ascii += (int) caractere;
        }

        return ascii * 31;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", NOME: " + nomeCliente + ", IDADE : " + idadeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Integer getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(Integer idadeCliente) {
        this.idadeCliente = idadeCliente;
    }
}
