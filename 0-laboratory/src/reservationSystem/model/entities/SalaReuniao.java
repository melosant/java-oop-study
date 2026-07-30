package reservationSystem.model.entities;

public class SalaReuniao extends Recurso {
    private Double valorHora;

    public SalaReuniao() {
    }

    public SalaReuniao(String nome, Double valorHora) {
        super(nome);
        this.valorHora = valorHora;
    }

    @Override
    public double calcularCustoReserva(int horas) {
        return valorHora * horas;
    }
}
