package reservationSystem.model.entities;

public abstract class Recurso {
    protected String nome;
    protected Boolean disponivel;

    public Recurso() {
    }

    public Recurso(String nome) {
        this.nome = nome;
        this.disponivel = true;
    }

    public abstract double calcularCustoReserva(int horas);

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
