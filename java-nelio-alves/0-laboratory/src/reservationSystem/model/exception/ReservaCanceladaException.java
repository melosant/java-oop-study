package reservationSystem.model.exception;

public class ReservaCanceladaException extends ReservaException {
    public ReservaCanceladaException() {
        super("ERRO: Reserva já está cancelada");
    }
}
