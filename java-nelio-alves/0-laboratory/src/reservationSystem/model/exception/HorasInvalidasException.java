package reservationSystem.model.exception;

public class HorasInvalidasException extends ReservaException {
    public HorasInvalidasException() {
        super("ERRO: entrada de horas inválida.");
    }
}
