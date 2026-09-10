package reservationSystem.model.entities;

public class Veiculo extends Recurso {
    private Double valorHora;
    private Double valorPorKm;
    private Double kmEstimado;

    public Veiculo() {
    }

    public Veiculo(String nome, Double valorHora, Double valorPorKm, Double kmEstimado) {
        super(nome);
        this.valorHora = valorHora;
        this.valorPorKm = valorPorKm;
        this.kmEstimado = kmEstimado;
    }

    @Override
    public double calcularCustoReserva(int horas) {
        return (valorHora * horas) + (valorPorKm * kmEstimado);
    }
}
